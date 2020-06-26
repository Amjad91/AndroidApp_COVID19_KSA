package com.example.covid_19ksa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView active;
    private TextView confirmed;
    private TextView critical;
    private TextView deaths;
    private TextView recovered;
    private TextView totalConfirmed;
    private TextView totalActive;
    private TextView totalDeaths;
    private TextView totalRecovered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        active = findViewById(R.id.active);
        confirmed = findViewById(R.id.txtConfirmed);
        critical = findViewById(R.id.critical);
        deaths = findViewById(R.id.deaths);
        recovered = findViewById(R.id.recovered);
        totalActive = findViewById(R.id.totalActive);
        totalConfirmed = findViewById(R.id.totalConfirmed);
        totalDeaths = findViewById(R.id.totalDeaths);
        totalRecovered = findViewById(R.id.totalRecovered);




        //Rerofit Library
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);

        Call<Case> call = api.getCases("Saudi-Arabia");
        call.enqueue(new Callback<Case>() {
            @Override
            public void onResponse(Call<Case> call, Response<Case> response) {


                Case aCase = response.body();

                Log.d("ok", aCase.getResponse().get(0).getCases().getActive().toString());

                active.setText(aCase.getResponse().get(0).getCases().getActive().toString());
                confirmed.setText(aCase.getResponse().get(0).getCases().getTotal().toString());
                critical.setText(aCase.getResponse().get(0).getCases().getCritical().toString());
                deaths.setText(aCase.getResponse().get(0).getDeaths().getTotal().toString());
                recovered.setText(aCase.getResponse().get(0).getCases().getRecovered().toString());

            }

            @Override
            public void onFailure(Call<Case> call, Throwable t) {
                Log.i("error", "error" + t.getLocalizedMessage());

            }
        });

        Call<Case> call2 = api.getCases("All");
        call2.enqueue(new Callback<Case>() {
            @Override
            public void onResponse(Call<Case> call, Response<Case> response) {
                Case aCase = response.body();

                Log.d("ok", aCase.getResponse().get(0).getCases().getActive().toString());

                totalActive.setText(aCase.getResponse().get(0).getCases().getActive().toString());
                totalConfirmed.setText(aCase.getResponse().get(0).getCases().getTotal().toString());
                totalDeaths.setText(aCase.getResponse().get(0).getDeaths().getTotal().toString());
                totalRecovered.setText(aCase.getResponse().get(0).getCases().getRecovered().toString());


            }

            @Override
            public void onFailure(Call<Case> call, Throwable t) {
                Log.i("error", "error" + t.getLocalizedMessage());

            }
        });

}
}