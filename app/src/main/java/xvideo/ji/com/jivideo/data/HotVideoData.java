package xvideo.ji.com.jivideo.data;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by Domon on 15-9-21.
 */
public class HotVideoData {

    /**
     * hots : [{"area":"USA","bt_url":"","country":"USA","description":"","high_point":25,"id":654,"low_point":20,"main_icon":"http://d.amobicdn.com/variety_show/20150906/GinnxRKtHc0_dt.jpg","score":0,"small_icon":"http://d.amobicdn.com/variety_show/20150906/GinnxRKtHc0_xt.jpg","title":"Criss Angel BeLIEve: Floating Coffee (On Spike)","url":"<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/watch?v=GinnxRKtHc0\" frameborder=\"0\" allowfullscreen><\/iframe>","video":"","video2":"","watch":7641}]
     * result : 0
     * status : 0
     */

    private int result;
    private int status;
    private List<HotsEntity> hots;

    public void setResult(int result) {
        this.result = result;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setHots(List<HotsEntity> hots) {
        this.hots = hots;
    }

    public int getResult() {
        return result;
    }

    public int getStatus() {
        return status;
    }

    public List<HotsEntity> getHots() {
        return hots;
    }

    public static class HotsEntity implements Parcelable {
        /**
         * area : USA
         * bt_url :
         * country : USA
         * description :
         * high_point : 25
         * id : 654
         * low_point : 20
         * main_icon : http://d.amobicdn.com/variety_show/20150906/GinnxRKtHc0_dt.jpg
         * score : 0
         * small_icon : http://d.amobicdn.com/variety_show/20150906/GinnxRKtHc0_xt.jpg
         * title : Criss Angel BeLIEve: Floating Coffee (On Spike)
         * url : <iframe width="560" height="315" src="https://www.youtube.com/watch?v=GinnxRKtHc0" frameborder="0" allowfullscreen></iframe>
         * video :
         * video2 :
         * watch : 7641
         * indexType : 1
         */

        private String area;
        private String bt_url;
        private String country;
        private String description;
        private int high_point;
        private int id;
        private int low_point;
        private String main_icon;
        private int score;
        private String small_icon;
        private String title;
        private String url;
        private String video;
        private String video2;
        private int watch;
        private int indexType;

        public HotsEntity() {

        }

        public HotsEntity(Parcel source) {
            area = source.readString();
            bt_url = source.readString();
            country = source.readString();
            description = source.readString();
            high_point = source.readInt();
            id = source.readInt();
            low_point = source.readInt();
            main_icon = source.readString();
            score = source.readInt();
            small_icon = source.readString();
            title = source.readString();
            url = source.readString();
            video = source.readString();
            video2 = source.readString();
            watch = source.readInt();
            indexType = source.readInt();
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flag) {
            dest.writeString(area);
            dest.writeString(bt_url);
            dest.writeString(country);
            dest.writeString(description);
            dest.writeInt(high_point);
            dest.writeInt(id);
            dest.writeInt(low_point);
            dest.writeString(main_icon);
            dest.writeInt(score);
            dest.writeString(small_icon);
            dest.writeString(title);
            dest.writeString(url);
            dest.writeString(video);
            dest.writeString(video2);
            dest.writeInt(watch);
            dest.writeInt(indexType);
        }

        public static final Creator<HotsEntity> CREATOR = new Creator<HotsEntity>() {
            @Override
            public HotsEntity createFromParcel(Parcel parcel) {
                return new HotsEntity(parcel);
            }

            @Override
            public HotsEntity[] newArray(int i) {
                return new HotsEntity[i];
            }
        };

        public void setArea(String area) {
            this.area = area;
        }

        public void setBt_url(String bt_url) {
            this.bt_url = bt_url;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setHigh_point(int high_point) {
            this.high_point = high_point;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setLow_point(int low_point) {
            this.low_point = low_point;
        }

        public void setMain_icon(String main_icon) {
            this.main_icon = main_icon;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public void setSmall_icon(String small_icon) {
            this.small_icon = small_icon;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setVideo(String video) {
            this.video = video;
        }

        public void setVideo2(String video2) {
            this.video2 = video2;
        }

        public void setWatch(int watch) {
            this.watch = watch;
        }

        public String getArea() {
            return area;
        }

        public String getBt_url() {
            return bt_url;
        }

        public String getCountry() {
            return country;
        }

        public String getDescription() {
            return description;
        }

        public int getHigh_point() {
            return high_point;
        }

        public int getId() {
            return id;
        }

        public int getLow_point() {
            return low_point;
        }

        public String getMain_icon() {
            return main_icon;
        }

        public int getScore() {
            return score;
        }

        public String getSmall_icon() {
            return small_icon;
        }

        public String getTitle() {
            return title;
        }

        public String getUrl() {
            return url;
        }

        public String getVideo() {
            return video;
        }

        public String getVideo2() {
            return video2;
        }

        public int getWatch() {
            return watch;
        }

        public int getIndexType() {
            return indexType;
        }

        public void setIndexType(int indexType) {
            this.indexType = indexType;
        }
    }
}
