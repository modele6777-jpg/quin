package defpackage;

import android.graphics.ComposeShader;
import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jg2 extends l4d {
    public final l4d c;
    public final l4d d;

    public jg2(l4d l4dVar, l4d l4dVar2) {
        this.c = l4dVar;
        this.d = l4dVar2;
    }

    @Override // defpackage.l4d
    public final Shader c(long j) {
        Shader shaderC = this.c.c(j);
        Shader shaderC2 = this.d.c(j);
        return Build.VERSION.SDK_INT >= 29 ? fv.b(shaderC, shaderC2, bp.U(5)) : new ComposeShader(shaderC, shaderC2, bp.X(5));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg2)) {
            return false;
        }
        jg2 jg2Var = (jg2) obj;
        return this.c.equals(jg2Var.c) && this.d.equals(jg2Var.d);
    }

    public final int hashCode() {
        return Integer.hashCode(5) + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String strZ = kn2.Z(5);
        StringBuilder sb = new StringBuilder("CompositeShaderBrush(dstBrush=");
        sb.append(this.c);
        sb.append(", srcBrush=");
        sb.append(this.d);
        sb.append(", blendMode=");
        return ks0.l(sb, strZ, ")");
    }
}
