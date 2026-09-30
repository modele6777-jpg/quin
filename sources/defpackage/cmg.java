package defpackage;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cmg extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public cmg(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbP = ub3.p("Pos: ", ", limit: ", j);
        sbP.append(j2);
        sbP.append(", len: ");
        sbP.append(i);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbP.toString()), indexOutOfBoundsException);
    }

    public cmg(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
