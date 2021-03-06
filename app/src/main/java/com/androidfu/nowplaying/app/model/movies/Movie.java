package com.androidfu.nowplaying.app.model.movies;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

import hugo.weaving.DebugLog;

@Parcel
@DebugLog
public class Movie {

    @Expose
    public String id;
    @Expose
    public String title;
    @Expose
    public Integer year;
    @SerializedName("mpaa_rating")
    @Expose
    public String mpaaRating;
    @SerializedName("critics_consensus")
    @Expose
    public String criticsConsensus;
    @SerializedName("release_dates")
    @Expose
    public ReleaseDates releaseDates;
    @Expose
    public Ratings ratings;
    @Expose
    public String synopsis;
    @Expose
    public Posters posters;
    @SerializedName("abridged_cast")
    @Expose
    public List<AbridgedCast> abridgedCast = new ArrayList<AbridgedCast>();
    @SerializedName("alternate_ids")
    @Expose
    public AlternateIds alternateIds;
    @Expose
    public Links links;

    /*
        This field must not match the JSON response so that we can manually parse the data.  See the
        RestClient for details.
    */
    public Integer movieRuntime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

    public Integer getMovieRuntime() {
        return movieRuntime;
    }

    public void setMovieRuntime(Integer movieRuntime) {
        this.movieRuntime = movieRuntime;
    }

    public String getCriticsConsensus() {
        return criticsConsensus;
    }

    public void setCriticsConsensus(String criticsConsensus) {
        this.criticsConsensus = criticsConsensus;
    }

    public ReleaseDates getReleaseDates() {
        return releaseDates;
    }

    public void setReleaseDates(ReleaseDates releaseDates) {
        this.releaseDates = releaseDates;
    }

    public Ratings getRatings() {
        return ratings;
    }

    public void setRatings(Ratings ratings) {
        this.ratings = ratings;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Posters getPosters() {
        return posters;
    }

    public void setPosters(Posters posters) {
        this.posters = posters;
    }

    public List<AbridgedCast> getAbridgedCast() {
        return abridgedCast;
    }

    public void setAbridgedCast(List<AbridgedCast> abridgedCast) {
        this.abridgedCast = abridgedCast;
    }

    public AlternateIds getAlternateIds() {
        return alternateIds;
    }

    public void setAlternateIds(AlternateIds alternateIds) {
        this.alternateIds = alternateIds;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

}
