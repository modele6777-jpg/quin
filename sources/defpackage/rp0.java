package defpackage;

import android.opengl.EGLSurface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rp0 {
    public final EGLSurface a;
    public final int b;
    public final int c;

    public rp0(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface == null) {
            r82.g("Null eglSurface");
            throw null;
        }
        this.a = eGLSurface;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rp0) {
            rp0 rp0Var = (rp0) obj;
            if (this.a.equals(rp0Var.a) && this.b == rp0Var.b && this.c == rp0Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return tec.g(this.c, "}", sb);
    }
}
