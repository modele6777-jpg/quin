package defpackage;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ck9 implements dk9, ypb {
    public final String a;

    public /* synthetic */ ck9(String str) {
        this.a = str;
    }

    @Override // defpackage.ypb
    public void accept(Object obj, Object obj2) {
        int i = w6h.l;
        i6h i6hVar = new i6h((gle) obj2);
        d7h d7hVar = (d7h) ((g7h) obj).l();
        Parcel parcelJ = d7hVar.J();
        lsg.c(parcelJ, i6hVar);
        parcelJ.writeString(this.a);
        d7hVar.K(parcelJ, 5);
    }

    @Override // defpackage.dk9
    public String w() {
        return ub3.l(new StringBuilder("expected '"), this.a, '\'');
    }
}
