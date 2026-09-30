package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class std {
    public final CharSequence a;
    public final vtd b;

    public std(CharSequence charSequence, vtd vtdVar) {
        Objects.requireNonNull(charSequence, "content must not be null");
        this.a = charSequence;
        this.b = vtdVar;
    }

    public final std a(int i, int i2) {
        int i3;
        CharSequence charSequenceSubSequence = this.a.subSequence(i, i2);
        vtd vtdVar = this.b;
        return new std(charSequenceSubSequence, (vtdVar == null || (i3 = i2 - i) == 0) ? null : new vtd(vtdVar.a, vtdVar.b + i, vtdVar.c + i, i3));
    }
}
