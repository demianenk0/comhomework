package com.itea.roman.lection8;

public class RecordBook {
    private String studentFirstName;
    private String studentLastName;
    private String faculcy;
    private StudentRecordBook studentRecordBook;
    public RecordBook(String studentFirstName, String studentLastName, String faculcy) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.faculcy = faculcy;
    }

    private class StudentRecordBook {

        private String sessions;
        private String offset;
        private String exams;

        public void setSessions(String sessions) {
            this.sessions = sessions;
        }

        public void setOffset(String offset) {
            this.offset = offset;
        }

        public void setExams(String exams) {
            this.exams = exams;
        }
    }
}
