package defpackage;

import ai.askquin.data.QuotaBlockReason;
import ai.askquin.ui.conversation.FailReason;
import ai.askquin.ui.conversation.Operation;
import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fb4 {
    public final jd4 a;
    public final List b;
    public final Operation c;
    public final FailReason d;
    public final Operation e;
    public final List f;
    public final QuotaBlockReason g;
    public final cm4 h;
    public final MixedDeckSnapshot i;

    public /* synthetic */ fb4(jd4 jd4Var, List list, Operation operation, FailReason failReason, Operation operation2, List list2, QuotaBlockReason quotaBlockReason, cm4 cm4Var, int i) {
        this(jd4Var, list, operation, failReason, operation2, (i & 32) != 0 ? pu4.a : list2, (i & 64) != 0 ? null : quotaBlockReason, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : cm4Var, (MixedDeckSnapshot) null);
    }

    public static fb4 a(fb4 fb4Var, bd4 bd4Var, ArrayList arrayList, Operation operation, FailReason failReason, Operation operation2, List list, QuotaBlockReason quotaBlockReason, cm4 cm4Var, MixedDeckSnapshot mixedDeckSnapshot, int i) {
        jd4 jd4Var = bd4Var;
        if ((i & 1) != 0) {
            jd4Var = fb4Var.a;
        }
        jd4 jd4Var2 = jd4Var;
        List list2 = arrayList;
        if ((i & 2) != 0) {
            list2 = fb4Var.b;
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            operation = fb4Var.c;
        }
        Operation operation3 = operation;
        if ((i & 8) != 0) {
            failReason = fb4Var.d;
        }
        FailReason failReason2 = failReason;
        if ((i & 16) != 0) {
            operation2 = fb4Var.e;
        }
        Operation operation4 = operation2;
        List list4 = (i & 32) != 0 ? fb4Var.f : list;
        QuotaBlockReason quotaBlockReason2 = (i & 64) != 0 ? fb4Var.g : quotaBlockReason;
        cm4 cm4Var2 = (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? fb4Var.h : cm4Var;
        MixedDeckSnapshot mixedDeckSnapshot2 = (i & 256) != 0 ? fb4Var.i : mixedDeckSnapshot;
        fb4Var.getClass();
        jd4Var2.getClass();
        list3.getClass();
        list4.getClass();
        return new fb4(jd4Var2, list3, operation3, failReason2, operation4, list4, quotaBlockReason2, cm4Var2, mixedDeckSnapshot2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb4)) {
            return false;
        }
        fb4 fb4Var = (fb4) obj;
        return pa7.t(this.a, fb4Var.a) && pa7.t(this.b, fb4Var.b) && pa7.t(this.c, fb4Var.c) && pa7.t(this.d, fb4Var.d) && pa7.t(this.e, fb4Var.e) && pa7.t(this.f, fb4Var.f) && this.g == fb4Var.g && pa7.t(this.h, fb4Var.h) && pa7.t(this.i, fb4Var.i);
    }

    public final int hashCode() {
        int iA = tec.a(this.a.hashCode() * 31, 31, this.b);
        Operation operation = this.c;
        int iHashCode = (iA + (operation == null ? 0 : operation.hashCode())) * 31;
        FailReason failReason = this.d;
        int iHashCode2 = (iHashCode + (failReason == null ? 0 : failReason.hashCode())) * 31;
        Operation operation2 = this.e;
        int iA2 = tec.a((iHashCode2 + (operation2 == null ? 0 : operation2.hashCode())) * 31, 31, this.f);
        QuotaBlockReason quotaBlockReason = this.g;
        int iHashCode3 = (iA2 + (quotaBlockReason == null ? 0 : quotaBlockReason.hashCode())) * 31;
        cm4 cm4Var = this.h;
        int iHashCode4 = (iHashCode3 + (cm4Var == null ? 0 : cm4Var.hashCode())) * 31;
        MixedDeckSnapshot mixedDeckSnapshot = this.i;
        return iHashCode4 + (mixedDeckSnapshot != null ? mixedDeckSnapshot.hashCode() : 0);
    }

    public final String toString() {
        return "DivinationContent(state=" + this.a + ", messages=" + this.b + ", failedOperation=" + this.c + ", failedReason=" + this.d + ", workingOperation=" + this.e + ", pendingClarifyingCards=" + this.f + ", readingBlockReason=" + this.g + ", drawBeforeQuestion=" + this.h + ", mixedDeck=" + this.i + ")";
    }

    public fb4(jd4 jd4Var, List list, Operation operation, FailReason failReason, Operation operation2, List list2, QuotaBlockReason quotaBlockReason, cm4 cm4Var, MixedDeckSnapshot mixedDeckSnapshot) {
        jd4Var.getClass();
        list2.getClass();
        this.a = jd4Var;
        this.b = list;
        this.c = operation;
        this.d = failReason;
        this.e = operation2;
        this.f = list2;
        this.g = quotaBlockReason;
        this.h = cm4Var;
        this.i = mixedDeckSnapshot;
    }
}
