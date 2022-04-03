package language.java.corebasic.stream;

class Pass{
        int id;
        String startStation;
        String endStation;
        int startt=0;
        int endt=0;

        public Pass() {
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getStartStation() {
                return startStation;
        }

        public void setStartStation(String startStation) {
                this.startStation = startStation;
        }

        public String getEndStation() {
                return endStation;
        }

        public void setEndStation(String endStation) {
                this.endStation = endStation;
        }

        public int getStartt() {
                return startt;
        }

        public void setStartt(int startt) {
                this.startt = startt;
        }

        public int getEndt() {
                return endt;
        }

        public void setEndt(int endt) {
                this.endt = endt;
        }

        @Override
        public String toString() {
                return "Pass{" +
                        "id=" + id +
                        ", startStation='" + startStation + '\'' +
                        ", endStation='" + endStation + '\'' +
                        ", startt=" + startt +
                        ", endt=" + endt +
                        '}';
        }
}