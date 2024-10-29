
package dad.openlibrary.api;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class SearchResult {

    @SerializedName("numFound")
    @Expose
    private Integer numFound;
    @SerializedName("start")
    @Expose
    private Integer start;
    @SerializedName("numFoundExact")
    @Expose
    private Boolean numFoundExact;
    @SerializedName("docs")
    @Expose
    private List<Doc> docs = new ArrayList<Doc>();
    @SerializedName("q")
    @Expose
    private String q;
    @SerializedName("offset")
    @Expose
    private Object offset;

    public Integer getNumFound() {
        return numFound;
    }

    public void setNumFound(Integer numFound) {
        this.numFound = numFound;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Boolean getNumFoundExact() {
        return numFoundExact;
    }

    public void setNumFoundExact(Boolean numFoundExact) {
        this.numFoundExact = numFoundExact;
    }

    public List<Doc> getDocs() {
        return docs;
    }

    public void setDocs(List<Doc> docs) {
        this.docs = docs;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public Object getOffset() {
        return offset;
    }

    public void setOffset(Object offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SearchResult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("numFound");
        sb.append('=');
        sb.append(((this.numFound == null)?"<null>":this.numFound));
        sb.append(',');
        sb.append("start");
        sb.append('=');
        sb.append(((this.start == null)?"<null>":this.start));
        sb.append(',');
        sb.append("numFoundExact");
        sb.append('=');
        sb.append(((this.numFoundExact == null)?"<null>":this.numFoundExact));
        sb.append(',');
        sb.append("docs");
        sb.append('=');
        sb.append(((this.docs == null)?"<null>":this.docs));
        sb.append(',');
        sb.append("q");
        sb.append('=');
        sb.append(((this.q == null)?"<null>":this.q));
        sb.append(',');
        sb.append("offset");
        sb.append('=');
        sb.append(((this.offset == null)?"<null>":this.offset));
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
        result = ((result* 31)+((this.start == null)? 0 :this.start.hashCode()));
        result = ((result* 31)+((this.q == null)? 0 :this.q.hashCode()));
        result = ((result* 31)+((this.docs == null)? 0 :this.docs.hashCode()));
        result = ((result* 31)+((this.offset == null)? 0 :this.offset.hashCode()));
        result = ((result* 31)+((this.numFound == null)? 0 :this.numFound.hashCode()));
        result = ((result* 31)+((this.numFoundExact == null)? 0 :this.numFoundExact.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SearchResult) == false) {
            return false;
        }
        SearchResult rhs = ((SearchResult) other);
        return (((((((this.start == rhs.start)||((this.start!= null)&&this.start.equals(rhs.start)))&&((this.q == rhs.q)||((this.q!= null)&&this.q.equals(rhs.q))))&&((this.docs == rhs.docs)||((this.docs!= null)&&this.docs.equals(rhs.docs))))&&((this.offset == rhs.offset)||((this.offset!= null)&&this.offset.equals(rhs.offset))))&&((this.numFound == rhs.numFound)||((this.numFound!= null)&&this.numFound.equals(rhs.numFound))))&&((this.numFoundExact == rhs.numFoundExact)||((this.numFoundExact!= null)&&this.numFoundExact.equals(rhs.numFoundExact))));
    }

}
