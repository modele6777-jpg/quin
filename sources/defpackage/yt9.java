package defpackage;

import android.util.Size;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yt9 {
    public final Size a;
    public final int b;
    public final String c;
    public final au9 d;
    public final zt9 e;
    public final bu9 f;
    public final cu9 g;
    public final List h;

    public yt9(Size size, int i, String str, au9 au9Var, zt9 zt9Var, bu9 bu9Var, cu9 cu9Var, List list) {
        size.getClass();
        this.a = size;
        this.b = i;
        this.c = str;
        this.d = au9Var;
        this.e = zt9Var;
        this.f = bu9Var;
        this.g = cu9Var;
        this.h = list;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config(size=");
        sb.append(this.a);
        sb.append(", format=");
        sb.append((Object) y2e.b(this.b));
        sb.append(", camera=");
        String str = this.c;
        sb.append((Object) (str == null ? "null" : ig1.b(str)));
        sb.append(", mirrorMode=");
        sb.append(this.d);
        sb.append(", timestampBase=null, dynamicRangeProfile=");
        sb.append(this.e);
        sb.append(", streamUseCase=");
        sb.append(this.f);
        sb.append(", streamUseHint=");
        sb.append(this.g);
        sb.append(", sensorPixelModes=");
        sb.append(this.h);
        sb.append(')');
        return sb.toString();
    }
}
