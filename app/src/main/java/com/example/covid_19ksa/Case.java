package com.example.covid_19ksa;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Case {

    @SerializedName("get")
    @Expose
    private String get;
    @SerializedName("parameters")
    @Expose
    private Parameters parameters;
    @SerializedName("results")
    @Expose
    private Integer results;
    @SerializedName("response")
    @Expose
    private List<Response> response = null;

    public String getGet() {
        return get;
    }


    public Parameters getParameters() {
        return parameters;
    }


    public Integer getResults() {
        return results;
    }


    public List<Response> getResponse() {
        return response;
    }




public class Cases {

    @SerializedName("new")
    @Expose
    private String _new;
    @SerializedName("active")
    @Expose
    private Integer active;
    @SerializedName("critical")
    @Expose
    private Integer critical;
    @SerializedName("recovered")
    @Expose
    private Integer recovered;
    @SerializedName("1M_pop")
    @Expose
    private String _1MPop;
    @SerializedName("total")
    @Expose
    private Integer total;

    public String getNew() {
        return _new;
    }


    public Integer getActive() {
        return active;
    }


    public Integer getCritical() {
        return critical;
    }



    public Integer getRecovered() {
        return recovered;
    }


    public String get1MPop() {
        return _1MPop;
    }



    public Integer getTotal() {
        return total;
    }


}

public class Deaths {

    @SerializedName("new")
    @Expose
    private String _new;
    @SerializedName("1M_pop")
    @Expose
    private String _1MPop;
    @SerializedName("total")
    @Expose
    private Integer total;

    public String getNew() {
        return _new;
    }


    public String get1MPop() {
        return _1MPop;
    }

    public Integer getTotal() {
        return total;
    }

}

public class Parameters {

    @SerializedName("country")
    @Expose
    private String country;

    public String getCountry() {
        return country;
    }

}

public class Response {

    @SerializedName("continent")
    @Expose
    private String continent;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("population")
    @Expose
    private Integer population;
    @SerializedName("cases")
    @Expose
    private Cases cases;
    @SerializedName("deaths")
    @Expose
    private Deaths deaths;
    @SerializedName("tests")
    @Expose
    private Tests tests;
    @SerializedName("day")
    @Expose
    private String day;
    @SerializedName("time")
    @Expose
    private String time;

    public String getContinent() {
        return continent;
    }

    public String getCountry() {
        return country;
    }

    public Integer getPopulation() {
        return population;
    }

    public Cases getCases() {
        return cases;
    }


    public Deaths getDeaths() {
        return deaths;
    }


    public Tests getTests() {
        return tests;
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }

}

public class Tests {

    @SerializedName("1M_pop")
    @Expose
    private String _1MPop;
    @SerializedName("total")
    @Expose
    private Integer total;

    public String get1MPop() {
        return _1MPop;
    }

    public Integer getTotal() {
        return total;
    }

}

}
