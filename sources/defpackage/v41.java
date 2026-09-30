package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public interface v41 extends mtd, ReadableByteChannel {
    boolean I(long j, a71 a71Var);

    int L(zr9 zr9Var);

    InputStream Y0();

    long a0(u41 u41Var);

    long f0(long j, a71 a71Var);

    f41 i();

    String n0(Charset charset);

    yhb peek();

    boolean request(long j);
}
