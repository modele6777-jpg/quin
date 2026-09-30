package defpackage;

import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ge6 extends rxg {
    public final TextPaint X;
    public final CharSequence z;

    public ge6(CharSequence charSequence, TextPaint textPaint) {
        this.z = charSequence;
        this.X = textPaint;
    }

    @Override // defpackage.rxg
    public final int J(int i) {
        CharSequence charSequence = this.z;
        return this.X.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // defpackage.rxg
    public final int M(int i) {
        CharSequence charSequence = this.z;
        return this.X.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
