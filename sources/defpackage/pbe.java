package defpackage;

import io.sentry.android.core.b1;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pbe implements v26 {
    public static final pbe a = new pbe();

    public final k47 a(v41 v41Var) {
        InputStream inputStreamY0 = v41Var.Y0();
        rbc rbcVar = new rbc();
        rbcVar.a = null;
        rbcVar.b = null;
        rbcVar.c = false;
        rbcVar.e = false;
        rbcVar.f = null;
        rbcVar.g = null;
        rbcVar.h = false;
        rbcVar.i = null;
        if (!inputStreamY0.markSupported()) {
            inputStreamY0 = new BufferedInputStream(inputStreamY0);
        }
        try {
            inputStreamY0.mark(3);
            int i = inputStreamY0.read() + (inputStreamY0.read() << 8);
            inputStreamY0.reset();
            if (i == 35615) {
                inputStreamY0 = new BufferedInputStream(new GZIPInputStream(inputStreamY0));
            }
        } catch (IOException unused) {
        }
        try {
            inputStreamY0.mark(4096);
            rbcVar.B(inputStreamY0);
            return new k47(7, rbcVar.a);
        } finally {
            try {
                inputStreamY0.close();
            } catch (IOException unused2) {
                b1.d("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    @Override // defpackage.v26
    public final m26 b() {
        return new h36(1, bm8.class, "parseSvg", "parseSvg(Lokio/BufferedSource;)Lcoil3/svg/Svg;", 1);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof pbe) && (obj instanceof v26)) {
            return b().equals(((v26) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
