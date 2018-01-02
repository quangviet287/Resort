public class SwimmingPool extends Service {
    private String openTime;
    private String endTime;

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String getHour() {
        String time = "Tu "+ getOpenTime()+ " den "+ getEndTime();
        return time;
    }
}
