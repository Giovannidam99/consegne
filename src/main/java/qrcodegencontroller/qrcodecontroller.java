package qrcodegencontroller;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import com.google.zxing.WriterException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.Base64;

public class qrcodecontroller {

    @PostMapping(value = "/", produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public ResponseEntity<byte[]> getQRCode(@RequestParam String url) {
        byte[] image;
        try {
            // Genera e restituisce il codice QR come array di byte
            image = qrcodegenerator.qrcodegenerator.getQRCode(url, 250, 250);


            return new ResponseEntity<>(image, HttpStatus.OK);
        } catch (WriterException | IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new byte[0]);
        }
    }


}
