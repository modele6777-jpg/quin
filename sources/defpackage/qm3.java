package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qm3 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = this.i;
        int i10 = this.j;
        long j = this.k;
        int i11 = this.l;
        String str = pqf.a;
        Locale locale = Locale.US;
        StringBuilder sbN = ib8.n(i, i2, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        ub3.u(sbN, i3, "\n skippedInputBuffers=", i4, "\n renderedOutputBuffers=");
        ub3.u(sbN, i5, "\n skippedOutputBuffers=", i6, "\n droppedBuffers=");
        ub3.u(sbN, i7, "\n droppedInputBuffers=", i8, "\n maxConsecutiveDroppedBuffers=");
        ub3.u(sbN, i9, "\n droppedToKeyframeEvents=", i10, "\n totalVideoFrameProcessingOffsetUs=");
        sbN.append(j);
        sbN.append("\n videoFrameProcessingOffsetCount=");
        sbN.append(i11);
        sbN.append("\n}");
        return sbN.toString();
    }
}
