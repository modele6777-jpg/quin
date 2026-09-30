package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oq0 {
    public int a;
    public final HashMap b;
    public final Executor c;
    public final bu0 d;
    public final Rect e;
    public final Matrix f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;
    public final List k;

    public oq0(Executor executor, bu0 bu0Var, Rect rect, Matrix matrix, int i, int i2, int i3, boolean z, List list) {
        this.a = ((CaptureFailedRetryQuirk) q74.a.b(CaptureFailedRetryQuirk.class)) == null ? 0 : 1;
        this.b = new HashMap();
        if (executor == null) {
            r82.g("Null appExecutor");
            throw null;
        }
        this.c = executor;
        this.d = bu0Var;
        this.e = rect;
        if (matrix == null) {
            r82.g("Null sensorToBufferTransform");
            throw null;
        }
        this.f = matrix;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = z;
        if (list != null) {
            this.k = list;
        } else {
            r82.g("Null sessionConfigCameraCaptureCallbacks");
            throw null;
        }
    }

    public final boolean a() {
        Iterator it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final void b(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.b;
        if (map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i), Boolean.TRUE);
        } else {
            b21.v("TakePictureRequest", "The format is not supported in simultaneous capture");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oq0) {
            oq0 oq0Var = (oq0) obj;
            if (this.c.equals(oq0Var.c) && this.d == oq0Var.d && this.e.equals(oq0Var.e) && this.f.equals(oq0Var.f) && this.g == oq0Var.g && this.h == oq0Var.h && this.i == oq0Var.i && this.j == oq0Var.j && this.k.equals(oq0Var.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.k.hashCode() ^ ((((((((((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1525764945) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TakePictureRequest{appExecutor=");
        sb.append(this.c);
        sb.append(", inMemoryCallback=");
        sb.append(this.d);
        sb.append(", onDiskCallback=null, outputFileOptions=null, secondaryOutputFileOptions=null, cropRect=");
        sb.append(this.e);
        sb.append(", sensorToBufferTransform=");
        sb.append(this.f);
        sb.append(", rotationDegrees=");
        sb.append(this.g);
        sb.append(", jpegQuality=");
        sb.append(this.h);
        sb.append(", captureMode=");
        sb.append(this.i);
        sb.append(", simultaneousCapture=");
        sb.append(this.j);
        sb.append(", sessionConfigCameraCaptureCallbacks=");
        return ks0.n(sb, this.k, "}");
    }
}
