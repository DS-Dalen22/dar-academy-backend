package post.coreapi2;
import java.util.ArrayList;
import java.util.List;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@SecurityRequirement(name = "JWT")
@RestController
@RequestMapping("/post")
@Tag(name = "PostController", description = "API для управления посылками")
public class PostController {
        private List<PostModel> posts = new ArrayList<>();


        @GetMapping("/check")
        @Operation(summary = "Проверка работоспособности API", description = "Метод для проверки, что API работает")
        @ApiResponse(responseCode = "200", description = "Проверка завершена")
        public ResponseEntity<String> check() {
            return ResponseEntity.ok("post-core-api is working");
        }



        @PostMapping
        @Operation(summary = "Отправить посылку", description = "Метод для отправки новой посылки")
        public ResponseEntity<String> createPost(@RequestBody PostModel post) {
            posts.add(post);
            return ResponseEntity.ok("Post created successfully");
        }

        @GetMapping("/all")
        @Operation(summary = "Получить список всех посылок", description = "Метод для получения списка всех посылок")
        @ApiResponse(responseCode = "200", description = "Получен список всех посылок")
        public ResponseEntity<List<PostModel>> getAllPosts() {
            return ResponseEntity.ok(posts);
        }


        @GetMapping("/{postId}")
        @Operation(summary = "Просмотреть статус посылки по ID", description = "Метод для просмотра статуса посылки по её ID")
        @ApiResponse(responseCode = "200", description = "Получены данные о посылке")
        @ApiResponse(responseCode = "404", description = "Посылка с указанным ID не найдена")
        public ResponseEntity<PostModel> getPostById(@PathVariable @Parameter(description = "ID поссылки", example = "1234") String postId) {
            PostModel post = posts.stream()
                    .filter(p -> p.getPostId().equals(postId))
                    .findFirst()
                    .orElse(null);
            if (post != null) {
                return ResponseEntity.ok(post);
            } else {
                return ResponseEntity.notFound().build();
            }
        }

        @PutMapping("/{postId}")
        @Operation(summary = "Изменить данные о посылке по ID", description = "Метод для изменения данных о посылке по её ID")
        @ApiResponse(responseCode = "200", description = "Посылка успешно обновлена")
        @ApiResponse(responseCode = "404", description = "Посылка с указанным ID не найдена")
        public ResponseEntity<String> updatePostById(@PathVariable @Parameter(description = "ID посылки", example = "1234") String postId, @RequestBody PostModel updatedPost) {
            PostModel post = posts.stream()
                    .filter(p -> p.getPostId().equals(postId))
                    .findFirst()
                    .orElse(null);
            if (post != null) {
                post.setClientId(updatedPost.getClientId());
                post.setPostRecipientId(updatedPost.getPostRecipientId());
                post.setPostItem(updatedPost.getPostItem());
                post.setStatus(updatedPost.getStatus());
                return ResponseEntity.ok("Post updated successfully");
            } else {
                return ResponseEntity.notFound().build();
            }
        }

        @DeleteMapping("/{postId}")
        @Operation(summary = "Удалить данные о посылке по ID", description = "Метод для удаления данных о посылке по её ID")
        @ApiResponse(responseCode = "200", description = "Посылка успешно удалена")
        @ApiResponse(responseCode = "404", description = "Посылка с указанным ID не найдена")
        public ResponseEntity<String> deletePostById(@PathVariable @Parameter(description = "ID посылки", example = "1234") String postId) {
            boolean removed = posts.removeIf(p -> p.getPostId().equals(postId));
            if (removed) {
                return ResponseEntity.ok("Post deleted successfully");
            } else {
                return ResponseEntity.notFound().build();
            }
        }

}
