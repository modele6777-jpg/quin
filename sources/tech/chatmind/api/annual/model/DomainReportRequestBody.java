package tech.chatmind.api.annual.model;

import defpackage.an1;
import defpackage.bie;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.gh4;
import defpackage.hh4;
import defpackage.ib8;
import defpackage.lw7;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.v74;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;
import tech.chatmind.api.common.model.TarotCardRequestBody;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Ltech/chatmind/api/annual/model/DomainReportRequestBody;", "", "", "Ltech/chatmind/api/common/model/TarotCardRequestBody;", "domainsCards", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/util/List;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/annual/model/DomainReportRequestBody;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Ltech/chatmind/api/annual/model/DomainReportRequestBody;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getDomainsCards", "Companion", "gh4", "hh4", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class DomainReportRequestBody {
    public static final int $stable = 8;
    private final List<TarotCardRequestBody> domainsCards;
    public static final hh4 Companion = new hh4();
    private static final lw7[] $childSerializers = {eb3.N(z18.b, new v74(5))};

    public /* synthetic */ DomainReportRequestBody(int i, List list, xyc xycVar) {
        if (1 == (i & 1)) {
            this.domainsCards = list;
        } else {
            an1.R(i, 1, gh4.a.e());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(bie.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DomainReportRequestBody copy$default(DomainReportRequestBody domainReportRequestBody, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = domainReportRequestBody.domainsCards;
        }
        return domainReportRequestBody.copy(list);
    }

    public final List<TarotCardRequestBody> component1() {
        return this.domainsCards;
    }

    public final DomainReportRequestBody copy(List<TarotCardRequestBody> domainsCards) {
        domainsCards.getClass();
        return new DomainReportRequestBody(domainsCards);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DomainReportRequestBody) && pa7.t(this.domainsCards, ((DomainReportRequestBody) other).domainsCards);
    }

    public final List<TarotCardRequestBody> getDomainsCards() {
        return this.domainsCards;
    }

    public int hashCode() {
        return this.domainsCards.hashCode();
    }

    public String toString() {
        return ib8.k("DomainReportRequestBody(domainsCards=", ")", this.domainsCards);
    }

    public DomainReportRequestBody(List<TarotCardRequestBody> list) {
        list.getClass();
        this.domainsCards = list;
    }
}
