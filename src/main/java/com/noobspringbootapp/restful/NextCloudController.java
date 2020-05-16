package com.noobspringbootapp.restful;

import okhttp3.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Base64;
import java.util.concurrent.TimeUnit;

@RestController
public class NextCloudController {

    @RequestMapping("/login/{u}/{p}")
    public String login(@PathVariable String u, @PathVariable String p) throws IOException {
        String encodedString = u+":"+p;
        String url = "https://nextcloud.tngdigital.com.my/remote.php/dav/files/<left-botton-settings-webdav-endpoint>/README.txt";
        OkHttpClient.Builder b = new OkHttpClient.Builder();
        b.readTimeout(30, TimeUnit.SECONDS);
        OkHttpClient client = b.build();
        Request request = new Request.Builder()
                .addHeader("Authorization", "Basic " + Base64.getEncoder().encodeToString(encodedString.getBytes()))
                .url(url)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

}