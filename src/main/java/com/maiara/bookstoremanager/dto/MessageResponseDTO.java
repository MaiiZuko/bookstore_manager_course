package com.maiara.bookstoremanager.dto;

public class MessageResponseDTO {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // Método builder para criar uma instância de MessageResponseDTO
    public static MessageResponseDTOBuilder builder() {
        return new MessageResponseDTOBuilder();
    }

    // Classe interna para construção do MessageResponseDTO
    public static class MessageResponseDTOBuilder {
        private String message;

        public MessageResponseDTOBuilder message(String message) {
            this.message = message;
            return this;
        }

        public MessageResponseDTO build() {
            MessageResponseDTO responseDTO = new MessageResponseDTO();
            responseDTO.setMessage(message);
            return responseDTO;
        }
    }
}
