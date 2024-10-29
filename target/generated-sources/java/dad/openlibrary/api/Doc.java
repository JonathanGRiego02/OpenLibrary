
package dad.openlibrary.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Doc {

    @SerializedName("author_alternative_name")
    @Expose
    private List<String> authorAlternativeName = new ArrayList<String>();
    @SerializedName("author_key")
    @Expose
    private List<String> authorKey = new ArrayList<String>();
    @SerializedName("author_name")
    @Expose
    private List<String> authorName = new ArrayList<String>();
    @SerializedName("contributor")
    @Expose
    private List<String> contributor = new ArrayList<String>();
    @SerializedName("cover_edition_key")
    @Expose
    private String coverEditionKey;
    @SerializedName("cover_i")
    @Expose
    private Integer coverI;
    @SerializedName("ddc")
    @Expose
    private List<String> ddc = new ArrayList<String>();
    @SerializedName("ebook_access")
    @Expose
    private String ebookAccess;
    @SerializedName("ebook_count_i")
    @Expose
    private Integer ebookCountI;
    @SerializedName("edition_count")
    @Expose
    private Integer editionCount;
    @SerializedName("edition_key")
    @Expose
    private List<String> editionKey = new ArrayList<String>();
    @SerializedName("first_publish_year")
    @Expose
    private Integer firstPublishYear;
    @SerializedName("format")
    @Expose
    private List<String> format = new ArrayList<String>();
    @SerializedName("has_fulltext")
    @Expose
    private Boolean hasFulltext;
    @SerializedName("ia")
    @Expose
    private List<String> ia = new ArrayList<String>();
    @SerializedName("ia_collection")
    @Expose
    private List<String> iaCollection = new ArrayList<String>();
    @SerializedName("ia_collection_s")
    @Expose
    private String iaCollectionS;
    @SerializedName("isbn")
    @Expose
    private List<String> isbn = new ArrayList<String>();
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("language")
    @Expose
    private List<String> language = new ArrayList<String>();
    @SerializedName("last_modified_i")
    @Expose
    private Integer lastModifiedI;
    @SerializedName("lcc")
    @Expose
    private List<String> lcc = new ArrayList<String>();
    @SerializedName("lccn")
    @Expose
    private List<String> lccn = new ArrayList<String>();
    @SerializedName("lending_edition_s")
    @Expose
    private String lendingEditionS;
    @SerializedName("lending_identifier_s")
    @Expose
    private String lendingIdentifierS;
    @SerializedName("number_of_pages_median")
    @Expose
    private Integer numberOfPagesMedian;
    @SerializedName("oclc")
    @Expose
    private List<String> oclc = new ArrayList<String>();
    @SerializedName("osp_count")
    @Expose
    private Integer ospCount;
    @SerializedName("printdisabled_s")
    @Expose
    private String printdisabledS;
    @SerializedName("public_scan_b")
    @Expose
    private Boolean publicScanB;
    @SerializedName("publish_date")
    @Expose
    private List<String> publishDate = new ArrayList<String>();
    @SerializedName("publish_place")
    @Expose
    private List<String> publishPlace = new ArrayList<String>();
    @SerializedName("publish_year")
    @Expose
    private List<Integer> publishYear = new ArrayList<Integer>();
    @SerializedName("publisher")
    @Expose
    private List<String> publisher = new ArrayList<String>();
    @SerializedName("seed")
    @Expose
    private List<String> seed = new ArrayList<String>();
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("title_sort")
    @Expose
    private String titleSort;
    @SerializedName("title_suggest")
    @Expose
    private String titleSuggest;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("id_amazon")
    @Expose
    private List<String> idAmazon = new ArrayList<String>();
    @SerializedName("id_goodreads")
    @Expose
    private List<String> idGoodreads = new ArrayList<String>();
    @SerializedName("id_amazon_co_uk_asin")
    @Expose
    private List<String> idAmazonCoUkAsin = new ArrayList<String>();
    @SerializedName("id_canadian_national_library_archive")
    @Expose
    private List<String> idCanadianNationalLibraryArchive = new ArrayList<String>();
    @SerializedName("id_librarything")
    @Expose
    private List<String> idLibrarything = new ArrayList<String>();
    @SerializedName("id_alibris_id")
    @Expose
    private List<String> idAlibrisId = new ArrayList<String>();
    @SerializedName("id_overdrive")
    @Expose
    private List<String> idOverdrive = new ArrayList<String>();
    @SerializedName("id_google")
    @Expose
    private List<String> idGoogle = new ArrayList<String>();
    @SerializedName("id_british_library")
    @Expose
    private List<String> idBritishLibrary = new ArrayList<String>();
    @SerializedName("id_wikidata")
    @Expose
    private List<String> idWikidata = new ArrayList<String>();
    @SerializedName("id_amazon_de_asin")
    @Expose
    private List<String> idAmazonDeAsin = new ArrayList<String>();
    @SerializedName("id_amazon_ca_asin")
    @Expose
    private List<String> idAmazonCaAsin = new ArrayList<String>();
    @SerializedName("id_annas_archive")
    @Expose
    private List<String> idAnnasArchive = new ArrayList<String>();
    @SerializedName("id_british_national_bibliography")
    @Expose
    private List<String> idBritishNationalBibliography = new ArrayList<String>();
    @SerializedName("id_libris")
    @Expose
    private List<String> idLibris = new ArrayList<String>();
    @SerializedName("id_dep\u00f3sito_legal")
    @Expose
    private List<String> idDepSitoLegal = new ArrayList<String>();
    @SerializedName("id_amazon_it_asin")
    @Expose
    private List<String> idAmazonItAsin = new ArrayList<String>();
    @SerializedName("id_isfdb")
    @Expose
    private List<String> idIsfdb = new ArrayList<String>();
    @SerializedName("subject")
    @Expose
    private List<String> subject = new ArrayList<String>();
    @SerializedName("place")
    @Expose
    private List<String> place = new ArrayList<String>();
    @SerializedName("person")
    @Expose
    private List<String> person = new ArrayList<String>();
    @SerializedName("ia_box_id")
    @Expose
    private List<String> iaBoxId = new ArrayList<String>();
    @SerializedName("ratings_average")
    @Expose
    private Double ratingsAverage;
    @SerializedName("ratings_sortable")
    @Expose
    private Double ratingsSortable;
    @SerializedName("ratings_count")
    @Expose
    private Integer ratingsCount;
    @SerializedName("ratings_count_1")
    @Expose
    private Integer ratingsCount1;
    @SerializedName("ratings_count_2")
    @Expose
    private Integer ratingsCount2;
    @SerializedName("ratings_count_3")
    @Expose
    private Integer ratingsCount3;
    @SerializedName("ratings_count_4")
    @Expose
    private Integer ratingsCount4;
    @SerializedName("ratings_count_5")
    @Expose
    private Integer ratingsCount5;
    @SerializedName("readinglog_count")
    @Expose
    private Integer readinglogCount;
    @SerializedName("want_to_read_count")
    @Expose
    private Integer wantToReadCount;
    @SerializedName("currently_reading_count")
    @Expose
    private Integer currentlyReadingCount;
    @SerializedName("already_read_count")
    @Expose
    private Integer alreadyReadCount;
    @SerializedName("publisher_facet")
    @Expose
    private List<String> publisherFacet = new ArrayList<String>();
    @SerializedName("person_key")
    @Expose
    private List<String> personKey = new ArrayList<String>();
    @SerializedName("place_key")
    @Expose
    private List<String> placeKey = new ArrayList<String>();
    @SerializedName("person_facet")
    @Expose
    private List<String> personFacet = new ArrayList<String>();
    @SerializedName("subject_facet")
    @Expose
    private List<String> subjectFacet = new ArrayList<String>();
    @SerializedName("_version_")
    @Expose
    private Long version;
    @SerializedName("place_facet")
    @Expose
    private List<String> placeFacet = new ArrayList<String>();
    @SerializedName("lcc_sort")
    @Expose
    private String lccSort;
    @SerializedName("author_facet")
    @Expose
    private List<String> authorFacet = new ArrayList<String>();
    @SerializedName("subject_key")
    @Expose
    private List<String> subjectKey = new ArrayList<String>();
    @SerializedName("ddc_sort")
    @Expose
    private String ddcSort;

    public List<String> getAuthorAlternativeName() {
        return authorAlternativeName;
    }

    public void setAuthorAlternativeName(List<String> authorAlternativeName) {
        this.authorAlternativeName = authorAlternativeName;
    }

    public List<String> getAuthorKey() {
        return authorKey;
    }

    public void setAuthorKey(List<String> authorKey) {
        this.authorKey = authorKey;
    }

    public List<String> getAuthorName() {
        return authorName;
    }

    public void setAuthorName(List<String> authorName) {
        this.authorName = authorName;
    }

    public List<String> getContributor() {
        return contributor;
    }

    public void setContributor(List<String> contributor) {
        this.contributor = contributor;
    }

    public String getCoverEditionKey() {
        return coverEditionKey;
    }

    public void setCoverEditionKey(String coverEditionKey) {
        this.coverEditionKey = coverEditionKey;
    }

    public Integer getCoverI() {
        return coverI;
    }

    public void setCoverI(Integer coverI) {
        this.coverI = coverI;
    }

    public List<String> getDdc() {
        return ddc;
    }

    public void setDdc(List<String> ddc) {
        this.ddc = ddc;
    }

    public String getEbookAccess() {
        return ebookAccess;
    }

    public void setEbookAccess(String ebookAccess) {
        this.ebookAccess = ebookAccess;
    }

    public Integer getEbookCountI() {
        return ebookCountI;
    }

    public void setEbookCountI(Integer ebookCountI) {
        this.ebookCountI = ebookCountI;
    }

    public Integer getEditionCount() {
        return editionCount;
    }

    public void setEditionCount(Integer editionCount) {
        this.editionCount = editionCount;
    }

    public List<String> getEditionKey() {
        return editionKey;
    }

    public void setEditionKey(List<String> editionKey) {
        this.editionKey = editionKey;
    }

    public Integer getFirstPublishYear() {
        return firstPublishYear;
    }

    public void setFirstPublishYear(Integer firstPublishYear) {
        this.firstPublishYear = firstPublishYear;
    }

    public List<String> getFormat() {
        return format;
    }

    public void setFormat(List<String> format) {
        this.format = format;
    }

    public Boolean getHasFulltext() {
        return hasFulltext;
    }

    public void setHasFulltext(Boolean hasFulltext) {
        this.hasFulltext = hasFulltext;
    }

    public List<String> getIa() {
        return ia;
    }

    public void setIa(List<String> ia) {
        this.ia = ia;
    }

    public List<String> getIaCollection() {
        return iaCollection;
    }

    public void setIaCollection(List<String> iaCollection) {
        this.iaCollection = iaCollection;
    }

    public String getIaCollectionS() {
        return iaCollectionS;
    }

    public void setIaCollectionS(String iaCollectionS) {
        this.iaCollectionS = iaCollectionS;
    }

    public List<String> getIsbn() {
        return isbn;
    }

    public void setIsbn(List<String> isbn) {
        this.isbn = isbn;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<String> getLanguage() {
        return language;
    }

    public void setLanguage(List<String> language) {
        this.language = language;
    }

    public Integer getLastModifiedI() {
        return lastModifiedI;
    }

    public void setLastModifiedI(Integer lastModifiedI) {
        this.lastModifiedI = lastModifiedI;
    }

    public List<String> getLcc() {
        return lcc;
    }

    public void setLcc(List<String> lcc) {
        this.lcc = lcc;
    }

    public List<String> getLccn() {
        return lccn;
    }

    public void setLccn(List<String> lccn) {
        this.lccn = lccn;
    }

    public String getLendingEditionS() {
        return lendingEditionS;
    }

    public void setLendingEditionS(String lendingEditionS) {
        this.lendingEditionS = lendingEditionS;
    }

    public String getLendingIdentifierS() {
        return lendingIdentifierS;
    }

    public void setLendingIdentifierS(String lendingIdentifierS) {
        this.lendingIdentifierS = lendingIdentifierS;
    }

    public Integer getNumberOfPagesMedian() {
        return numberOfPagesMedian;
    }

    public void setNumberOfPagesMedian(Integer numberOfPagesMedian) {
        this.numberOfPagesMedian = numberOfPagesMedian;
    }

    public List<String> getOclc() {
        return oclc;
    }

    public void setOclc(List<String> oclc) {
        this.oclc = oclc;
    }

    public Integer getOspCount() {
        return ospCount;
    }

    public void setOspCount(Integer ospCount) {
        this.ospCount = ospCount;
    }

    public String getPrintdisabledS() {
        return printdisabledS;
    }

    public void setPrintdisabledS(String printdisabledS) {
        this.printdisabledS = printdisabledS;
    }

    public Boolean getPublicScanB() {
        return publicScanB;
    }

    public void setPublicScanB(Boolean publicScanB) {
        this.publicScanB = publicScanB;
    }

    public List<String> getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(List<String> publishDate) {
        this.publishDate = publishDate;
    }

    public List<String> getPublishPlace() {
        return publishPlace;
    }

    public void setPublishPlace(List<String> publishPlace) {
        this.publishPlace = publishPlace;
    }

    public List<Integer> getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(List<Integer> publishYear) {
        this.publishYear = publishYear;
    }

    public List<String> getPublisher() {
        return publisher;
    }

    public void setPublisher(List<String> publisher) {
        this.publisher = publisher;
    }

    public List<String> getSeed() {
        return seed;
    }

    public void setSeed(List<String> seed) {
        this.seed = seed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleSort() {
        return titleSort;
    }

    public void setTitleSort(String titleSort) {
        this.titleSort = titleSort;
    }

    public String getTitleSuggest() {
        return titleSuggest;
    }

    public void setTitleSuggest(String titleSuggest) {
        this.titleSuggest = titleSuggest;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getIdAmazon() {
        return idAmazon;
    }

    public void setIdAmazon(List<String> idAmazon) {
        this.idAmazon = idAmazon;
    }

    public List<String> getIdGoodreads() {
        return idGoodreads;
    }

    public void setIdGoodreads(List<String> idGoodreads) {
        this.idGoodreads = idGoodreads;
    }

    public List<String> getIdAmazonCoUkAsin() {
        return idAmazonCoUkAsin;
    }

    public void setIdAmazonCoUkAsin(List<String> idAmazonCoUkAsin) {
        this.idAmazonCoUkAsin = idAmazonCoUkAsin;
    }

    public List<String> getIdCanadianNationalLibraryArchive() {
        return idCanadianNationalLibraryArchive;
    }

    public void setIdCanadianNationalLibraryArchive(List<String> idCanadianNationalLibraryArchive) {
        this.idCanadianNationalLibraryArchive = idCanadianNationalLibraryArchive;
    }

    public List<String> getIdLibrarything() {
        return idLibrarything;
    }

    public void setIdLibrarything(List<String> idLibrarything) {
        this.idLibrarything = idLibrarything;
    }

    public List<String> getIdAlibrisId() {
        return idAlibrisId;
    }

    public void setIdAlibrisId(List<String> idAlibrisId) {
        this.idAlibrisId = idAlibrisId;
    }

    public List<String> getIdOverdrive() {
        return idOverdrive;
    }

    public void setIdOverdrive(List<String> idOverdrive) {
        this.idOverdrive = idOverdrive;
    }

    public List<String> getIdGoogle() {
        return idGoogle;
    }

    public void setIdGoogle(List<String> idGoogle) {
        this.idGoogle = idGoogle;
    }

    public List<String> getIdBritishLibrary() {
        return idBritishLibrary;
    }

    public void setIdBritishLibrary(List<String> idBritishLibrary) {
        this.idBritishLibrary = idBritishLibrary;
    }

    public List<String> getIdWikidata() {
        return idWikidata;
    }

    public void setIdWikidata(List<String> idWikidata) {
        this.idWikidata = idWikidata;
    }

    public List<String> getIdAmazonDeAsin() {
        return idAmazonDeAsin;
    }

    public void setIdAmazonDeAsin(List<String> idAmazonDeAsin) {
        this.idAmazonDeAsin = idAmazonDeAsin;
    }

    public List<String> getIdAmazonCaAsin() {
        return idAmazonCaAsin;
    }

    public void setIdAmazonCaAsin(List<String> idAmazonCaAsin) {
        this.idAmazonCaAsin = idAmazonCaAsin;
    }

    public List<String> getIdAnnasArchive() {
        return idAnnasArchive;
    }

    public void setIdAnnasArchive(List<String> idAnnasArchive) {
        this.idAnnasArchive = idAnnasArchive;
    }

    public List<String> getIdBritishNationalBibliography() {
        return idBritishNationalBibliography;
    }

    public void setIdBritishNationalBibliography(List<String> idBritishNationalBibliography) {
        this.idBritishNationalBibliography = idBritishNationalBibliography;
    }

    public List<String> getIdLibris() {
        return idLibris;
    }

    public void setIdLibris(List<String> idLibris) {
        this.idLibris = idLibris;
    }

    public List<String> getIdDepSitoLegal() {
        return idDepSitoLegal;
    }

    public void setIdDepSitoLegal(List<String> idDepSitoLegal) {
        this.idDepSitoLegal = idDepSitoLegal;
    }

    public List<String> getIdAmazonItAsin() {
        return idAmazonItAsin;
    }

    public void setIdAmazonItAsin(List<String> idAmazonItAsin) {
        this.idAmazonItAsin = idAmazonItAsin;
    }

    public List<String> getIdIsfdb() {
        return idIsfdb;
    }

    public void setIdIsfdb(List<String> idIsfdb) {
        this.idIsfdb = idIsfdb;
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    public List<String> getPlace() {
        return place;
    }

    public void setPlace(List<String> place) {
        this.place = place;
    }

    public List<String> getPerson() {
        return person;
    }

    public void setPerson(List<String> person) {
        this.person = person;
    }

    public List<String> getIaBoxId() {
        return iaBoxId;
    }

    public void setIaBoxId(List<String> iaBoxId) {
        this.iaBoxId = iaBoxId;
    }

    public Double getRatingsAverage() {
        return ratingsAverage;
    }

    public void setRatingsAverage(Double ratingsAverage) {
        this.ratingsAverage = ratingsAverage;
    }

    public Double getRatingsSortable() {
        return ratingsSortable;
    }

    public void setRatingsSortable(Double ratingsSortable) {
        this.ratingsSortable = ratingsSortable;
    }

    public Integer getRatingsCount() {
        return ratingsCount;
    }

    public void setRatingsCount(Integer ratingsCount) {
        this.ratingsCount = ratingsCount;
    }

    public Integer getRatingsCount1() {
        return ratingsCount1;
    }

    public void setRatingsCount1(Integer ratingsCount1) {
        this.ratingsCount1 = ratingsCount1;
    }

    public Integer getRatingsCount2() {
        return ratingsCount2;
    }

    public void setRatingsCount2(Integer ratingsCount2) {
        this.ratingsCount2 = ratingsCount2;
    }

    public Integer getRatingsCount3() {
        return ratingsCount3;
    }

    public void setRatingsCount3(Integer ratingsCount3) {
        this.ratingsCount3 = ratingsCount3;
    }

    public Integer getRatingsCount4() {
        return ratingsCount4;
    }

    public void setRatingsCount4(Integer ratingsCount4) {
        this.ratingsCount4 = ratingsCount4;
    }

    public Integer getRatingsCount5() {
        return ratingsCount5;
    }

    public void setRatingsCount5(Integer ratingsCount5) {
        this.ratingsCount5 = ratingsCount5;
    }

    public Integer getReadinglogCount() {
        return readinglogCount;
    }

    public void setReadinglogCount(Integer readinglogCount) {
        this.readinglogCount = readinglogCount;
    }

    public Integer getWantToReadCount() {
        return wantToReadCount;
    }

    public void setWantToReadCount(Integer wantToReadCount) {
        this.wantToReadCount = wantToReadCount;
    }

    public Integer getCurrentlyReadingCount() {
        return currentlyReadingCount;
    }

    public void setCurrentlyReadingCount(Integer currentlyReadingCount) {
        this.currentlyReadingCount = currentlyReadingCount;
    }

    public Integer getAlreadyReadCount() {
        return alreadyReadCount;
    }

    public void setAlreadyReadCount(Integer alreadyReadCount) {
        this.alreadyReadCount = alreadyReadCount;
    }

    public List<String> getPublisherFacet() {
        return publisherFacet;
    }

    public void setPublisherFacet(List<String> publisherFacet) {
        this.publisherFacet = publisherFacet;
    }

    public List<String> getPersonKey() {
        return personKey;
    }

    public void setPersonKey(List<String> personKey) {
        this.personKey = personKey;
    }

    public List<String> getPlaceKey() {
        return placeKey;
    }

    public void setPlaceKey(List<String> placeKey) {
        this.placeKey = placeKey;
    }

    public List<String> getPersonFacet() {
        return personFacet;
    }

    public void setPersonFacet(List<String> personFacet) {
        this.personFacet = personFacet;
    }

    public List<String> getSubjectFacet() {
        return subjectFacet;
    }

    public void setSubjectFacet(List<String> subjectFacet) {
        this.subjectFacet = subjectFacet;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public List<String> getPlaceFacet() {
        return placeFacet;
    }

    public void setPlaceFacet(List<String> placeFacet) {
        this.placeFacet = placeFacet;
    }

    public String getLccSort() {
        return lccSort;
    }

    public void setLccSort(String lccSort) {
        this.lccSort = lccSort;
    }

    public List<String> getAuthorFacet() {
        return authorFacet;
    }

    public void setAuthorFacet(List<String> authorFacet) {
        this.authorFacet = authorFacet;
    }

    public List<String> getSubjectKey() {
        return subjectKey;
    }

    public void setSubjectKey(List<String> subjectKey) {
        this.subjectKey = subjectKey;
    }

    public String getDdcSort() {
        return ddcSort;
    }

    public void setDdcSort(String ddcSort) {
        this.ddcSort = ddcSort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Doc.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("authorAlternativeName");
        sb.append('=');
        sb.append(((this.authorAlternativeName == null)?"<null>":this.authorAlternativeName));
        sb.append(',');
        sb.append("authorKey");
        sb.append('=');
        sb.append(((this.authorKey == null)?"<null>":this.authorKey));
        sb.append(',');
        sb.append("authorName");
        sb.append('=');
        sb.append(((this.authorName == null)?"<null>":this.authorName));
        sb.append(',');
        sb.append("contributor");
        sb.append('=');
        sb.append(((this.contributor == null)?"<null>":this.contributor));
        sb.append(',');
        sb.append("coverEditionKey");
        sb.append('=');
        sb.append(((this.coverEditionKey == null)?"<null>":this.coverEditionKey));
        sb.append(',');
        sb.append("coverI");
        sb.append('=');
        sb.append(((this.coverI == null)?"<null>":this.coverI));
        sb.append(',');
        sb.append("ddc");
        sb.append('=');
        sb.append(((this.ddc == null)?"<null>":this.ddc));
        sb.append(',');
        sb.append("ebookAccess");
        sb.append('=');
        sb.append(((this.ebookAccess == null)?"<null>":this.ebookAccess));
        sb.append(',');
        sb.append("ebookCountI");
        sb.append('=');
        sb.append(((this.ebookCountI == null)?"<null>":this.ebookCountI));
        sb.append(',');
        sb.append("editionCount");
        sb.append('=');
        sb.append(((this.editionCount == null)?"<null>":this.editionCount));
        sb.append(',');
        sb.append("editionKey");
        sb.append('=');
        sb.append(((this.editionKey == null)?"<null>":this.editionKey));
        sb.append(',');
        sb.append("firstPublishYear");
        sb.append('=');
        sb.append(((this.firstPublishYear == null)?"<null>":this.firstPublishYear));
        sb.append(',');
        sb.append("format");
        sb.append('=');
        sb.append(((this.format == null)?"<null>":this.format));
        sb.append(',');
        sb.append("hasFulltext");
        sb.append('=');
        sb.append(((this.hasFulltext == null)?"<null>":this.hasFulltext));
        sb.append(',');
        sb.append("ia");
        sb.append('=');
        sb.append(((this.ia == null)?"<null>":this.ia));
        sb.append(',');
        sb.append("iaCollection");
        sb.append('=');
        sb.append(((this.iaCollection == null)?"<null>":this.iaCollection));
        sb.append(',');
        sb.append("iaCollectionS");
        sb.append('=');
        sb.append(((this.iaCollectionS == null)?"<null>":this.iaCollectionS));
        sb.append(',');
        sb.append("isbn");
        sb.append('=');
        sb.append(((this.isbn == null)?"<null>":this.isbn));
        sb.append(',');
        sb.append("key");
        sb.append('=');
        sb.append(((this.key == null)?"<null>":this.key));
        sb.append(',');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("lastModifiedI");
        sb.append('=');
        sb.append(((this.lastModifiedI == null)?"<null>":this.lastModifiedI));
        sb.append(',');
        sb.append("lcc");
        sb.append('=');
        sb.append(((this.lcc == null)?"<null>":this.lcc));
        sb.append(',');
        sb.append("lccn");
        sb.append('=');
        sb.append(((this.lccn == null)?"<null>":this.lccn));
        sb.append(',');
        sb.append("lendingEditionS");
        sb.append('=');
        sb.append(((this.lendingEditionS == null)?"<null>":this.lendingEditionS));
        sb.append(',');
        sb.append("lendingIdentifierS");
        sb.append('=');
        sb.append(((this.lendingIdentifierS == null)?"<null>":this.lendingIdentifierS));
        sb.append(',');
        sb.append("numberOfPagesMedian");
        sb.append('=');
        sb.append(((this.numberOfPagesMedian == null)?"<null>":this.numberOfPagesMedian));
        sb.append(',');
        sb.append("oclc");
        sb.append('=');
        sb.append(((this.oclc == null)?"<null>":this.oclc));
        sb.append(',');
        sb.append("ospCount");
        sb.append('=');
        sb.append(((this.ospCount == null)?"<null>":this.ospCount));
        sb.append(',');
        sb.append("printdisabledS");
        sb.append('=');
        sb.append(((this.printdisabledS == null)?"<null>":this.printdisabledS));
        sb.append(',');
        sb.append("publicScanB");
        sb.append('=');
        sb.append(((this.publicScanB == null)?"<null>":this.publicScanB));
        sb.append(',');
        sb.append("publishDate");
        sb.append('=');
        sb.append(((this.publishDate == null)?"<null>":this.publishDate));
        sb.append(',');
        sb.append("publishPlace");
        sb.append('=');
        sb.append(((this.publishPlace == null)?"<null>":this.publishPlace));
        sb.append(',');
        sb.append("publishYear");
        sb.append('=');
        sb.append(((this.publishYear == null)?"<null>":this.publishYear));
        sb.append(',');
        sb.append("publisher");
        sb.append('=');
        sb.append(((this.publisher == null)?"<null>":this.publisher));
        sb.append(',');
        sb.append("seed");
        sb.append('=');
        sb.append(((this.seed == null)?"<null>":this.seed));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("titleSort");
        sb.append('=');
        sb.append(((this.titleSort == null)?"<null>":this.titleSort));
        sb.append(',');
        sb.append("titleSuggest");
        sb.append('=');
        sb.append(((this.titleSuggest == null)?"<null>":this.titleSuggest));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("idAmazon");
        sb.append('=');
        sb.append(((this.idAmazon == null)?"<null>":this.idAmazon));
        sb.append(',');
        sb.append("idGoodreads");
        sb.append('=');
        sb.append(((this.idGoodreads == null)?"<null>":this.idGoodreads));
        sb.append(',');
        sb.append("idAmazonCoUkAsin");
        sb.append('=');
        sb.append(((this.idAmazonCoUkAsin == null)?"<null>":this.idAmazonCoUkAsin));
        sb.append(',');
        sb.append("idCanadianNationalLibraryArchive");
        sb.append('=');
        sb.append(((this.idCanadianNationalLibraryArchive == null)?"<null>":this.idCanadianNationalLibraryArchive));
        sb.append(',');
        sb.append("idLibrarything");
        sb.append('=');
        sb.append(((this.idLibrarything == null)?"<null>":this.idLibrarything));
        sb.append(',');
        sb.append("idAlibrisId");
        sb.append('=');
        sb.append(((this.idAlibrisId == null)?"<null>":this.idAlibrisId));
        sb.append(',');
        sb.append("idOverdrive");
        sb.append('=');
        sb.append(((this.idOverdrive == null)?"<null>":this.idOverdrive));
        sb.append(',');
        sb.append("idGoogle");
        sb.append('=');
        sb.append(((this.idGoogle == null)?"<null>":this.idGoogle));
        sb.append(',');
        sb.append("idBritishLibrary");
        sb.append('=');
        sb.append(((this.idBritishLibrary == null)?"<null>":this.idBritishLibrary));
        sb.append(',');
        sb.append("idWikidata");
        sb.append('=');
        sb.append(((this.idWikidata == null)?"<null>":this.idWikidata));
        sb.append(',');
        sb.append("idAmazonDeAsin");
        sb.append('=');
        sb.append(((this.idAmazonDeAsin == null)?"<null>":this.idAmazonDeAsin));
        sb.append(',');
        sb.append("idAmazonCaAsin");
        sb.append('=');
        sb.append(((this.idAmazonCaAsin == null)?"<null>":this.idAmazonCaAsin));
        sb.append(',');
        sb.append("idAnnasArchive");
        sb.append('=');
        sb.append(((this.idAnnasArchive == null)?"<null>":this.idAnnasArchive));
        sb.append(',');
        sb.append("idBritishNationalBibliography");
        sb.append('=');
        sb.append(((this.idBritishNationalBibliography == null)?"<null>":this.idBritishNationalBibliography));
        sb.append(',');
        sb.append("idLibris");
        sb.append('=');
        sb.append(((this.idLibris == null)?"<null>":this.idLibris));
        sb.append(',');
        sb.append("idDepSitoLegal");
        sb.append('=');
        sb.append(((this.idDepSitoLegal == null)?"<null>":this.idDepSitoLegal));
        sb.append(',');
        sb.append("idAmazonItAsin");
        sb.append('=');
        sb.append(((this.idAmazonItAsin == null)?"<null>":this.idAmazonItAsin));
        sb.append(',');
        sb.append("idIsfdb");
        sb.append('=');
        sb.append(((this.idIsfdb == null)?"<null>":this.idIsfdb));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("place");
        sb.append('=');
        sb.append(((this.place == null)?"<null>":this.place));
        sb.append(',');
        sb.append("person");
        sb.append('=');
        sb.append(((this.person == null)?"<null>":this.person));
        sb.append(',');
        sb.append("iaBoxId");
        sb.append('=');
        sb.append(((this.iaBoxId == null)?"<null>":this.iaBoxId));
        sb.append(',');
        sb.append("ratingsAverage");
        sb.append('=');
        sb.append(((this.ratingsAverage == null)?"<null>":this.ratingsAverage));
        sb.append(',');
        sb.append("ratingsSortable");
        sb.append('=');
        sb.append(((this.ratingsSortable == null)?"<null>":this.ratingsSortable));
        sb.append(',');
        sb.append("ratingsCount");
        sb.append('=');
        sb.append(((this.ratingsCount == null)?"<null>":this.ratingsCount));
        sb.append(',');
        sb.append("ratingsCount1");
        sb.append('=');
        sb.append(((this.ratingsCount1 == null)?"<null>":this.ratingsCount1));
        sb.append(',');
        sb.append("ratingsCount2");
        sb.append('=');
        sb.append(((this.ratingsCount2 == null)?"<null>":this.ratingsCount2));
        sb.append(',');
        sb.append("ratingsCount3");
        sb.append('=');
        sb.append(((this.ratingsCount3 == null)?"<null>":this.ratingsCount3));
        sb.append(',');
        sb.append("ratingsCount4");
        sb.append('=');
        sb.append(((this.ratingsCount4 == null)?"<null>":this.ratingsCount4));
        sb.append(',');
        sb.append("ratingsCount5");
        sb.append('=');
        sb.append(((this.ratingsCount5 == null)?"<null>":this.ratingsCount5));
        sb.append(',');
        sb.append("readinglogCount");
        sb.append('=');
        sb.append(((this.readinglogCount == null)?"<null>":this.readinglogCount));
        sb.append(',');
        sb.append("wantToReadCount");
        sb.append('=');
        sb.append(((this.wantToReadCount == null)?"<null>":this.wantToReadCount));
        sb.append(',');
        sb.append("currentlyReadingCount");
        sb.append('=');
        sb.append(((this.currentlyReadingCount == null)?"<null>":this.currentlyReadingCount));
        sb.append(',');
        sb.append("alreadyReadCount");
        sb.append('=');
        sb.append(((this.alreadyReadCount == null)?"<null>":this.alreadyReadCount));
        sb.append(',');
        sb.append("publisherFacet");
        sb.append('=');
        sb.append(((this.publisherFacet == null)?"<null>":this.publisherFacet));
        sb.append(',');
        sb.append("personKey");
        sb.append('=');
        sb.append(((this.personKey == null)?"<null>":this.personKey));
        sb.append(',');
        sb.append("placeKey");
        sb.append('=');
        sb.append(((this.placeKey == null)?"<null>":this.placeKey));
        sb.append(',');
        sb.append("personFacet");
        sb.append('=');
        sb.append(((this.personFacet == null)?"<null>":this.personFacet));
        sb.append(',');
        sb.append("subjectFacet");
        sb.append('=');
        sb.append(((this.subjectFacet == null)?"<null>":this.subjectFacet));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("placeFacet");
        sb.append('=');
        sb.append(((this.placeFacet == null)?"<null>":this.placeFacet));
        sb.append(',');
        sb.append("lccSort");
        sb.append('=');
        sb.append(((this.lccSort == null)?"<null>":this.lccSort));
        sb.append(',');
        sb.append("authorFacet");
        sb.append('=');
        sb.append(((this.authorFacet == null)?"<null>":this.authorFacet));
        sb.append(',');
        sb.append("subjectKey");
        sb.append('=');
        sb.append(((this.subjectKey == null)?"<null>":this.subjectKey));
        sb.append(',');
        sb.append("ddcSort");
        sb.append('=');
        sb.append(((this.ddcSort == null)?"<null>":this.ddcSort));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.ebookCountI == null)? 0 :this.ebookCountI.hashCode()));
        result = ((result* 31)+((this.lendingEditionS == null)? 0 :this.lendingEditionS.hashCode()));
        result = ((result* 31)+((this.idLibris == null)? 0 :this.idLibris.hashCode()));
        result = ((result* 31)+((this.idAlibrisId == null)? 0 :this.idAlibrisId.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.publishDate == null)? 0 :this.publishDate.hashCode()));
        result = ((result* 31)+((this.language == null)? 0 :this.language.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.idDepSitoLegal == null)? 0 :this.idDepSitoLegal.hashCode()));
        result = ((result* 31)+((this.idAmazonDeAsin == null)? 0 :this.idAmazonDeAsin.hashCode()));
        result = ((result* 31)+((this.alreadyReadCount == null)? 0 :this.alreadyReadCount.hashCode()));
        result = ((result* 31)+((this.ddcSort == null)? 0 :this.ddcSort.hashCode()));
        result = ((result* 31)+((this.lccn == null)? 0 :this.lccn.hashCode()));
        result = ((result* 31)+((this.lendingIdentifierS == null)? 0 :this.lendingIdentifierS.hashCode()));
        result = ((result* 31)+((this.personKey == null)? 0 :this.personKey.hashCode()));
        result = ((result* 31)+((this.publicScanB == null)? 0 :this.publicScanB.hashCode()));
        result = ((result* 31)+((this.wantToReadCount == null)? 0 :this.wantToReadCount.hashCode()));
        result = ((result* 31)+((this.placeKey == null)? 0 :this.placeKey.hashCode()));
        result = ((result* 31)+((this.idBritishLibrary == null)? 0 :this.idBritishLibrary.hashCode()));
        result = ((result* 31)+((this.lastModifiedI == null)? 0 :this.lastModifiedI.hashCode()));
        result = ((result* 31)+((this.firstPublishYear == null)? 0 :this.firstPublishYear.hashCode()));
        result = ((result* 31)+((this.ia == null)? 0 :this.ia.hashCode()));
        result = ((result* 31)+((this.ratingsCount == null)? 0 :this.ratingsCount.hashCode()));
        result = ((result* 31)+((this.idAmazon == null)? 0 :this.idAmazon.hashCode()));
        result = ((result* 31)+((this.numberOfPagesMedian == null)? 0 :this.numberOfPagesMedian.hashCode()));
        result = ((result* 31)+((this.editionKey == null)? 0 :this.editionKey.hashCode()));
        result = ((result* 31)+((this.printdisabledS == null)? 0 :this.printdisabledS.hashCode()));
        result = ((result* 31)+((this.idOverdrive == null)? 0 :this.idOverdrive.hashCode()));
        result = ((result* 31)+((this.lccSort == null)? 0 :this.lccSort.hashCode()));
        result = ((result* 31)+((this.titleSort == null)? 0 :this.titleSort.hashCode()));
        result = ((result* 31)+((this.authorKey == null)? 0 :this.authorKey.hashCode()));
        result = ((result* 31)+((this.editionCount == null)? 0 :this.editionCount.hashCode()));
        result = ((result* 31)+((this.format == null)? 0 :this.format.hashCode()));
        result = ((result* 31)+((this.readinglogCount == null)? 0 :this.readinglogCount.hashCode()));
        result = ((result* 31)+((this.idCanadianNationalLibraryArchive == null)? 0 :this.idCanadianNationalLibraryArchive.hashCode()));
        result = ((result* 31)+((this.publishPlace == null)? 0 :this.publishPlace.hashCode()));
        result = ((result* 31)+((this.idGoodreads == null)? 0 :this.idGoodreads.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.coverI == null)? 0 :this.coverI.hashCode()));
        result = ((result* 31)+((this.publishYear == null)? 0 :this.publishYear.hashCode()));
        result = ((result* 31)+((this.idAmazonItAsin == null)? 0 :this.idAmazonItAsin.hashCode()));
        result = ((result* 31)+((this.authorName == null)? 0 :this.authorName.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.publisher == null)? 0 :this.publisher.hashCode()));
        result = ((result* 31)+((this.idAmazonCoUkAsin == null)? 0 :this.idAmazonCoUkAsin.hashCode()));
        result = ((result* 31)+((this.ebookAccess == null)? 0 :this.ebookAccess.hashCode()));
        result = ((result* 31)+((this.publisherFacet == null)? 0 :this.publisherFacet.hashCode()));
        result = ((result* 31)+((this.seed == null)? 0 :this.seed.hashCode()));
        result = ((result* 31)+((this.iaBoxId == null)? 0 :this.iaBoxId.hashCode()));
        result = ((result* 31)+((this.isbn == null)? 0 :this.isbn.hashCode()));
        result = ((result* 31)+((this.idWikidata == null)? 0 :this.idWikidata.hashCode()));
        result = ((result* 31)+((this.iaCollectionS == null)? 0 :this.iaCollectionS.hashCode()));
        result = ((result* 31)+((this.subjectFacet == null)? 0 :this.subjectFacet.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.placeFacet == null)? 0 :this.placeFacet.hashCode()));
        result = ((result* 31)+((this.lcc == null)? 0 :this.lcc.hashCode()));
        result = ((result* 31)+((this.ratingsAverage == null)? 0 :this.ratingsAverage.hashCode()));
        result = ((result* 31)+((this.hasFulltext == null)? 0 :this.hasFulltext.hashCode()));
        result = ((result* 31)+((this.coverEditionKey == null)? 0 :this.coverEditionKey.hashCode()));
        result = ((result* 31)+((this.idIsfdb == null)? 0 :this.idIsfdb.hashCode()));
        result = ((result* 31)+((this.contributor == null)? 0 :this.contributor.hashCode()));
        result = ((result* 31)+((this.idAmazonCaAsin == null)? 0 :this.idAmazonCaAsin.hashCode()));
        result = ((result* 31)+((this.authorAlternativeName == null)? 0 :this.authorAlternativeName.hashCode()));
        result = ((result* 31)+((this.iaCollection == null)? 0 :this.iaCollection.hashCode()));
        result = ((result* 31)+((this.place == null)? 0 :this.place.hashCode()));
        result = ((result* 31)+((this.personFacet == null)? 0 :this.personFacet.hashCode()));
        result = ((result* 31)+((this.subjectKey == null)? 0 :this.subjectKey.hashCode()));
        result = ((result* 31)+((this.key == null)? 0 :this.key.hashCode()));
        result = ((result* 31)+((this.idAnnasArchive == null)? 0 :this.idAnnasArchive.hashCode()));
        result = ((result* 31)+((this.ddc == null)? 0 :this.ddc.hashCode()));
        result = ((result* 31)+((this.ratingsCount5 == null)? 0 :this.ratingsCount5 .hashCode()));
        result = ((result* 31)+((this.idLibrarything == null)? 0 :this.idLibrarything.hashCode()));
        result = ((result* 31)+((this.ratingsCount3 == null)? 0 :this.ratingsCount3 .hashCode()));
        result = ((result* 31)+((this.ratingsCount4 == null)? 0 :this.ratingsCount4 .hashCode()));
        result = ((result* 31)+((this.ratingsCount1 == null)? 0 :this.ratingsCount1 .hashCode()));
        result = ((result* 31)+((this.ratingsCount2 == null)? 0 :this.ratingsCount2 .hashCode()));
        result = ((result* 31)+((this.ospCount == null)? 0 :this.ospCount.hashCode()));
        result = ((result* 31)+((this.authorFacet == null)? 0 :this.authorFacet.hashCode()));
        result = ((result* 31)+((this.idGoogle == null)? 0 :this.idGoogle.hashCode()));
        result = ((result* 31)+((this.oclc == null)? 0 :this.oclc.hashCode()));
        result = ((result* 31)+((this.idBritishNationalBibliography == null)? 0 :this.idBritishNationalBibliography.hashCode()));
        result = ((result* 31)+((this.ratingsSortable == null)? 0 :this.ratingsSortable.hashCode()));
        result = ((result* 31)+((this.currentlyReadingCount == null)? 0 :this.currentlyReadingCount.hashCode()));
        result = ((result* 31)+((this.titleSuggest == null)? 0 :this.titleSuggest.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Doc) == false) {
            return false;
        }
        Doc rhs = ((Doc) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.ebookCountI == rhs.ebookCountI)||((this.ebookCountI!= null)&&this.ebookCountI.equals(rhs.ebookCountI)))&&((this.lendingEditionS == rhs.lendingEditionS)||((this.lendingEditionS!= null)&&this.lendingEditionS.equals(rhs.lendingEditionS))))&&((this.idLibris == rhs.idLibris)||((this.idLibris!= null)&&this.idLibris.equals(rhs.idLibris))))&&((this.idAlibrisId == rhs.idAlibrisId)||((this.idAlibrisId!= null)&&this.idAlibrisId.equals(rhs.idAlibrisId))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.publishDate == rhs.publishDate)||((this.publishDate!= null)&&this.publishDate.equals(rhs.publishDate))))&&((this.language == rhs.language)||((this.language!= null)&&this.language.equals(rhs.language))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.idDepSitoLegal == rhs.idDepSitoLegal)||((this.idDepSitoLegal!= null)&&this.idDepSitoLegal.equals(rhs.idDepSitoLegal))))&&((this.idAmazonDeAsin == rhs.idAmazonDeAsin)||((this.idAmazonDeAsin!= null)&&this.idAmazonDeAsin.equals(rhs.idAmazonDeAsin))))&&((this.alreadyReadCount == rhs.alreadyReadCount)||((this.alreadyReadCount!= null)&&this.alreadyReadCount.equals(rhs.alreadyReadCount))))&&((this.ddcSort == rhs.ddcSort)||((this.ddcSort!= null)&&this.ddcSort.equals(rhs.ddcSort))))&&((this.lccn == rhs.lccn)||((this.lccn!= null)&&this.lccn.equals(rhs.lccn))))&&((this.lendingIdentifierS == rhs.lendingIdentifierS)||((this.lendingIdentifierS!= null)&&this.lendingIdentifierS.equals(rhs.lendingIdentifierS))))&&((this.personKey == rhs.personKey)||((this.personKey!= null)&&this.personKey.equals(rhs.personKey))))&&((this.publicScanB == rhs.publicScanB)||((this.publicScanB!= null)&&this.publicScanB.equals(rhs.publicScanB))))&&((this.wantToReadCount == rhs.wantToReadCount)||((this.wantToReadCount!= null)&&this.wantToReadCount.equals(rhs.wantToReadCount))))&&((this.placeKey == rhs.placeKey)||((this.placeKey!= null)&&this.placeKey.equals(rhs.placeKey))))&&((this.idBritishLibrary == rhs.idBritishLibrary)||((this.idBritishLibrary!= null)&&this.idBritishLibrary.equals(rhs.idBritishLibrary))))&&((this.lastModifiedI == rhs.lastModifiedI)||((this.lastModifiedI!= null)&&this.lastModifiedI.equals(rhs.lastModifiedI))))&&((this.firstPublishYear == rhs.firstPublishYear)||((this.firstPublishYear!= null)&&this.firstPublishYear.equals(rhs.firstPublishYear))))&&((this.ia == rhs.ia)||((this.ia!= null)&&this.ia.equals(rhs.ia))))&&((this.ratingsCount == rhs.ratingsCount)||((this.ratingsCount!= null)&&this.ratingsCount.equals(rhs.ratingsCount))))&&((this.idAmazon == rhs.idAmazon)||((this.idAmazon!= null)&&this.idAmazon.equals(rhs.idAmazon))))&&((this.numberOfPagesMedian == rhs.numberOfPagesMedian)||((this.numberOfPagesMedian!= null)&&this.numberOfPagesMedian.equals(rhs.numberOfPagesMedian))))&&((this.editionKey == rhs.editionKey)||((this.editionKey!= null)&&this.editionKey.equals(rhs.editionKey))))&&((this.printdisabledS == rhs.printdisabledS)||((this.printdisabledS!= null)&&this.printdisabledS.equals(rhs.printdisabledS))))&&((this.idOverdrive == rhs.idOverdrive)||((this.idOverdrive!= null)&&this.idOverdrive.equals(rhs.idOverdrive))))&&((this.lccSort == rhs.lccSort)||((this.lccSort!= null)&&this.lccSort.equals(rhs.lccSort))))&&((this.titleSort == rhs.titleSort)||((this.titleSort!= null)&&this.titleSort.equals(rhs.titleSort))))&&((this.authorKey == rhs.authorKey)||((this.authorKey!= null)&&this.authorKey.equals(rhs.authorKey))))&&((this.editionCount == rhs.editionCount)||((this.editionCount!= null)&&this.editionCount.equals(rhs.editionCount))))&&((this.format == rhs.format)||((this.format!= null)&&this.format.equals(rhs.format))))&&((this.readinglogCount == rhs.readinglogCount)||((this.readinglogCount!= null)&&this.readinglogCount.equals(rhs.readinglogCount))))&&((this.idCanadianNationalLibraryArchive == rhs.idCanadianNationalLibraryArchive)||((this.idCanadianNationalLibraryArchive!= null)&&this.idCanadianNationalLibraryArchive.equals(rhs.idCanadianNationalLibraryArchive))))&&((this.publishPlace == rhs.publishPlace)||((this.publishPlace!= null)&&this.publishPlace.equals(rhs.publishPlace))))&&((this.idGoodreads == rhs.idGoodreads)||((this.idGoodreads!= null)&&this.idGoodreads.equals(rhs.idGoodreads))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.coverI == rhs.coverI)||((this.coverI!= null)&&this.coverI.equals(rhs.coverI))))&&((this.publishYear == rhs.publishYear)||((this.publishYear!= null)&&this.publishYear.equals(rhs.publishYear))))&&((this.idAmazonItAsin == rhs.idAmazonItAsin)||((this.idAmazonItAsin!= null)&&this.idAmazonItAsin.equals(rhs.idAmazonItAsin))))&&((this.authorName == rhs.authorName)||((this.authorName!= null)&&this.authorName.equals(rhs.authorName))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.publisher == rhs.publisher)||((this.publisher!= null)&&this.publisher.equals(rhs.publisher))))&&((this.idAmazonCoUkAsin == rhs.idAmazonCoUkAsin)||((this.idAmazonCoUkAsin!= null)&&this.idAmazonCoUkAsin.equals(rhs.idAmazonCoUkAsin))))&&((this.ebookAccess == rhs.ebookAccess)||((this.ebookAccess!= null)&&this.ebookAccess.equals(rhs.ebookAccess))))&&((this.publisherFacet == rhs.publisherFacet)||((this.publisherFacet!= null)&&this.publisherFacet.equals(rhs.publisherFacet))))&&((this.seed == rhs.seed)||((this.seed!= null)&&this.seed.equals(rhs.seed))))&&((this.iaBoxId == rhs.iaBoxId)||((this.iaBoxId!= null)&&this.iaBoxId.equals(rhs.iaBoxId))))&&((this.isbn == rhs.isbn)||((this.isbn!= null)&&this.isbn.equals(rhs.isbn))))&&((this.idWikidata == rhs.idWikidata)||((this.idWikidata!= null)&&this.idWikidata.equals(rhs.idWikidata))))&&((this.iaCollectionS == rhs.iaCollectionS)||((this.iaCollectionS!= null)&&this.iaCollectionS.equals(rhs.iaCollectionS))))&&((this.subjectFacet == rhs.subjectFacet)||((this.subjectFacet!= null)&&this.subjectFacet.equals(rhs.subjectFacet))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.placeFacet == rhs.placeFacet)||((this.placeFacet!= null)&&this.placeFacet.equals(rhs.placeFacet))))&&((this.lcc == rhs.lcc)||((this.lcc!= null)&&this.lcc.equals(rhs.lcc))))&&((this.ratingsAverage == rhs.ratingsAverage)||((this.ratingsAverage!= null)&&this.ratingsAverage.equals(rhs.ratingsAverage))))&&((this.hasFulltext == rhs.hasFulltext)||((this.hasFulltext!= null)&&this.hasFulltext.equals(rhs.hasFulltext))))&&((this.coverEditionKey == rhs.coverEditionKey)||((this.coverEditionKey!= null)&&this.coverEditionKey.equals(rhs.coverEditionKey))))&&((this.idIsfdb == rhs.idIsfdb)||((this.idIsfdb!= null)&&this.idIsfdb.equals(rhs.idIsfdb))))&&((this.contributor == rhs.contributor)||((this.contributor!= null)&&this.contributor.equals(rhs.contributor))))&&((this.idAmazonCaAsin == rhs.idAmazonCaAsin)||((this.idAmazonCaAsin!= null)&&this.idAmazonCaAsin.equals(rhs.idAmazonCaAsin))))&&((this.authorAlternativeName == rhs.authorAlternativeName)||((this.authorAlternativeName!= null)&&this.authorAlternativeName.equals(rhs.authorAlternativeName))))&&((this.iaCollection == rhs.iaCollection)||((this.iaCollection!= null)&&this.iaCollection.equals(rhs.iaCollection))))&&((this.place == rhs.place)||((this.place!= null)&&this.place.equals(rhs.place))))&&((this.personFacet == rhs.personFacet)||((this.personFacet!= null)&&this.personFacet.equals(rhs.personFacet))))&&((this.subjectKey == rhs.subjectKey)||((this.subjectKey!= null)&&this.subjectKey.equals(rhs.subjectKey))))&&((this.key == rhs.key)||((this.key!= null)&&this.key.equals(rhs.key))))&&((this.idAnnasArchive == rhs.idAnnasArchive)||((this.idAnnasArchive!= null)&&this.idAnnasArchive.equals(rhs.idAnnasArchive))))&&((this.ddc == rhs.ddc)||((this.ddc!= null)&&this.ddc.equals(rhs.ddc))))&&((this.ratingsCount5 == rhs.ratingsCount5)||((this.ratingsCount5 != null)&&this.ratingsCount5 .equals(rhs.ratingsCount5))))&&((this.idLibrarything == rhs.idLibrarything)||((this.idLibrarything!= null)&&this.idLibrarything.equals(rhs.idLibrarything))))&&((this.ratingsCount3 == rhs.ratingsCount3)||((this.ratingsCount3 != null)&&this.ratingsCount3 .equals(rhs.ratingsCount3))))&&((this.ratingsCount4 == rhs.ratingsCount4)||((this.ratingsCount4 != null)&&this.ratingsCount4 .equals(rhs.ratingsCount4))))&&((this.ratingsCount1 == rhs.ratingsCount1)||((this.ratingsCount1 != null)&&this.ratingsCount1 .equals(rhs.ratingsCount1))))&&((this.ratingsCount2 == rhs.ratingsCount2)||((this.ratingsCount2 != null)&&this.ratingsCount2 .equals(rhs.ratingsCount2))))&&((this.ospCount == rhs.ospCount)||((this.ospCount!= null)&&this.ospCount.equals(rhs.ospCount))))&&((this.authorFacet == rhs.authorFacet)||((this.authorFacet!= null)&&this.authorFacet.equals(rhs.authorFacet))))&&((this.idGoogle == rhs.idGoogle)||((this.idGoogle!= null)&&this.idGoogle.equals(rhs.idGoogle))))&&((this.oclc == rhs.oclc)||((this.oclc!= null)&&this.oclc.equals(rhs.oclc))))&&((this.idBritishNationalBibliography == rhs.idBritishNationalBibliography)||((this.idBritishNationalBibliography!= null)&&this.idBritishNationalBibliography.equals(rhs.idBritishNationalBibliography))))&&((this.ratingsSortable == rhs.ratingsSortable)||((this.ratingsSortable!= null)&&this.ratingsSortable.equals(rhs.ratingsSortable))))&&((this.currentlyReadingCount == rhs.currentlyReadingCount)||((this.currentlyReadingCount!= null)&&this.currentlyReadingCount.equals(rhs.currentlyReadingCount))))&&((this.titleSuggest == rhs.titleSuggest)||((this.titleSuggest!= null)&&this.titleSuggest.equals(rhs.titleSuggest))));
    }

}
