package defpackage;

import java.util.List;
import tech.chatmind.api.annual.model.DomainContent;
import tech.chatmind.api.annual.model.UserPostContent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pg4 {
    public final v50 a;
    public final List b;
    public final DomainContent c;
    public final UserPostContent d;

    static {
        mg4 mg4Var = DomainContent.Companion;
    }

    public pg4(v50 v50Var, List list, DomainContent domainContent, UserPostContent userPostContent) {
        this.a = v50Var;
        this.b = list;
        this.c = domainContent;
        this.d = userPostContent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg4)) {
            return false;
        }
        pg4 pg4Var = (pg4) obj;
        return this.a == pg4Var.a && this.b.equals(pg4Var.b) && pa7.t(this.c, pg4Var.c) && pa7.t(this.d, pg4Var.d);
    }

    public final int hashCode() {
        int iA = tec.a(this.a.hashCode() * 31, 31, this.b);
        DomainContent domainContent = this.c;
        int iHashCode = (iA + (domainContent == null ? 0 : domainContent.hashCode())) * 31;
        UserPostContent userPostContent = this.d;
        return iHashCode + (userPostContent != null ? userPostContent.hashCode() : 0);
    }

    public final String toString() {
        return "DomainFullyInformation(annualStatus=" + this.a + ", cards=" + this.b + ", content=" + this.c + ", user=" + this.d + ")";
    }
}
