package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface po8 {
    void a();

    void b(Bundle bundle);

    void d(int i, n03 n03Var, long j, int i2);

    void e(int i, int i2, int i3, long j);

    void f(int i);

    void flush();

    default void g(ny2 ny2Var) {
        ny2Var.run();
    }

    MediaFormat h();

    void i();

    void j(int i, long j);

    int k();

    int l(MediaCodec.BufferInfo bufferInfo);

    void m(int i);

    ByteBuffer n(int i);

    void o(Surface surface);

    ByteBuffer p(int i);

    void q(ArrayList arrayList);

    void r(fp8 fp8Var, Handler handler);

    default boolean s(kb6 kb6Var) {
        return false;
    }

    void t(ArrayList arrayList);
}
