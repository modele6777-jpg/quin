package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jhf {
    public final List a;
    public final bwa b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public jhf(List list, bwa bwaVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        list.getClass();
        this.a = list;
        this.b = bwaVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
    }

    public static jhf a(jhf jhfVar, List list, bwa bwaVar, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            list = jhfVar.a;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            bwaVar = jhfVar.b;
        }
        bwa bwaVar2 = bwaVar;
        boolean z5 = (i & 4) != 0 ? jhfVar.c : false;
        if ((i & 8) != 0) {
            z = jhfVar.d;
        }
        boolean z6 = z;
        if ((i & 16) != 0) {
            z2 = jhfVar.e;
        }
        boolean z7 = z2;
        boolean z8 = (i & 32) != 0 ? jhfVar.f : true;
        boolean z9 = (i & 64) != 0 ? jhfVar.g : z3;
        boolean z10 = (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? jhfVar.h : z4;
        jhfVar.getClass();
        list2.getClass();
        return new jhf(list2, bwaVar2, z5, z6, z7, z8, z9, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhf)) {
            return false;
        }
        jhf jhfVar = (jhf) obj;
        return pa7.t(this.a, jhfVar.a) && pa7.t(this.b, jhfVar.b) && this.c == jhfVar.c && this.d == jhfVar.d && this.e == jhfVar.e && this.f == jhfVar.f && this.g == jhfVar.g && this.h == jhfVar.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        bwa bwaVar = this.b;
        return Boolean.hashCode(this.h) + ub3.d(ub3.d(ub3.d(ub3.d(ub3.d((iHashCode + (bwaVar == null ? 0 : bwaVar.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpgradePaywallUiState(products=");
        sb.append(this.a);
        sb.append(", selectedProduct=");
        sb.append(this.b);
        sb.append(", isLoading=");
        ib8.w(sb, this.c, ", loadFailed=", this.d, ", neverPurchased=");
        ib8.w(sb, this.e, ", subscriptionPurchaseConfirmed=", this.f, ", hasSubscription=");
        sb.append(this.g);
        sb.append(", isCheckingPurchase=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
