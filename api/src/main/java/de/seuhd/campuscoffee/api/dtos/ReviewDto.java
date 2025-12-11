package de.seuhd.campuscoffee.api.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.Builder;
import lombok.NonNull;
import org.jspecify.annotations.Nullable;

import java.time.LocalDateTime;

/**
 * DTO record for POS metadata.
 */
@Builder(toBuilder = true)
public record ReviewDto (
        @Nullable Long id,
        @Nullable LocalDateTime createdAt,
        @Nullable LocalDateTime updatedAt,
        @NonNull @NotNull Long posId,
        @NonNull @NotNull Long authorId,
        @NonNull @NotNull String review,
        @Nullable Boolean approved
        // TODO: Implement ReviewDto
) implements Dto<Long> {
    @Override
    public @Nullable Long getId() {
        return id;
    }
}
