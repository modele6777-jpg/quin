package defpackage;

import android.view.textclassifier.TextClassification;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qme {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;
    public final ArrayList d;

    public qme(CharSequence charSequence, long j, TextClassification textClassification, ArrayList arrayList) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qme)) {
            return false;
        }
        qme qmeVar = (qme) obj;
        return pa7.t(this.a, qmeVar.a) && eue.c(this.b, qmeVar.b) && pa7.t(this.c, qmeVar.c) && this.d.equals(qmeVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = eue.c;
        return this.d.hashCode() + ((this.c.hashCode() + ib8.b(iHashCode, 31, this.b)) * 31);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + eue.i(this.b) + ", textClassification=" + this.c + ", icons=" + this.d + ")";
    }
}
