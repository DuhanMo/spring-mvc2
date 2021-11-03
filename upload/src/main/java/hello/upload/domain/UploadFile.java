package hello.upload.domain;

import lombok.Data;

/**
 * 업로드 파일 정보 보관
 */
@Data
public class UploadFile {

    private String uploadFileName; // 유저가 업로드한 파일의 이름
    private String storeFileName; // 스토어에 저장되는 유니크한 이름

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
