package com.test.board.vo;

public class PageMakerVO {
    private CriteriaVO cri;
    private int totalCount;
    private int startPage;
    private int endPage;
    private boolean prev;
    private boolean next;
    private int displayPageNum = 5;

    public CriteriaVO getCri() {
        return cri;
    }
    public void setCri(CriteriaVO cri) {
        this.cri = cri;
    }
    public int getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
        calacData();
    }

    private void calacData() {
        endPage = (int) (Math.ceil(cri.getPage() / (double) displayPageNum) * displayPageNum);

        startPage = (endPage - displayPageNum) + 1;
        if(startPage <= 0) startPage = 1;

        int tempEndPage = (int)(Math.ceil(totalCount / (double)cri.getPerPageNum()));
        if(endPage > tempEndPage) {
            endPage = tempEndPage;
        }
        prev = startPage == 1;
        next = endPage * cri.getPerPageNum() < totalCount;
    }
    public int getStartPage() {
        return startPage;
    }
    public void setStartPage(int startPage) {
        this.startPage = startPage;
    }
    public int getEndPage() {
        return endPage;
    }
    public void setEndPage(int endPage) {
        this.endPage = endPage;
    }
    public boolean isPrev() {
        return prev;
    }
    public void setPrev(boolean prev) {
        this.prev =  prev;
    }
    public boolean isNext() {
        return next;
    }
    public void setNext(boolean next) {
        this.next = next;
    }
    public int getDisplayPageNum() {
        return displayPageNum;
    }
    public void setDisplayPageNum(int displayPageNum) {
        this.displayPageNum = displayPageNum;
    }
}
