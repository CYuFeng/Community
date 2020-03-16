package com.example.community.provider;

import com.example.community.dto.AccessTokenDTO;
import org.springframework.stereotype.Component;

/**
 * Created by CYuFeng on 2020/3/16 10:21 PM
 */

@Component
public class GithubProvider {

    public String getAccessTokenDTO(AccessTokenDTO accessTokenDTO){
        public static final MediaType JSON
                = MediaType.get("application/json; charset=utf-8");

        OkHttpClient client = new OkHttpClient();

        String post(String url, String json) throws IOException {
            RequestBody body = RequestBody.create(json, JSON);
            Request request = new Request.Builder()
                    .url(url)
                    .post(body)
                    .build();
            try (Response response = client.newCall(request).execute()) {
                return response.body().string();
            }
        }
    }
}
