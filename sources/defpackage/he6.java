package defpackage;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class he6 extends rxg {
    public final BreakIterator z;

    public he6(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.z = characterInstance;
    }

    @Override // defpackage.rxg
    public final int J(int i) {
        return this.z.following(i);
    }

    @Override // defpackage.rxg
    public final int M(int i) {
        return this.z.preceding(i);
    }
}
