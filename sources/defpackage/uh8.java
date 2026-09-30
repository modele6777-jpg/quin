package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uh8 {
    public HashMap c;
    public HashMap d;
    public float e;
    public HashMap f;
    public ArrayList g;
    public fud h;
    public gg8 i;
    public ArrayList j;
    public Rect k;
    public float l;
    public float m;
    public float n;
    public boolean o;
    public final y25 a = new y25();
    public final HashSet b = new HashSet();
    public int p = 0;

    public final void a(String str) {
        gf8.b(str);
        this.b.add(str);
    }

    public final float b() {
        return (long) (((this.m - this.l) / this.n) * 1000.0f);
    }

    public final Map c() {
        float fC = xqf.c();
        if (fC != this.e) {
            for (Map.Entry entry : this.d.entrySet()) {
                HashMap map = this.d;
                String str = (String) entry.getKey();
                ri8 ri8Var = (ri8) entry.getValue();
                float f = this.e / fC;
                int i = (int) (ri8Var.a * f);
                int i2 = (int) (ri8Var.b * f);
                ri8 ri8Var2 = new ri8(i, i2, ri8Var.c, ri8Var.d, ri8Var.e);
                Bitmap bitmap = ri8Var.f;
                if (bitmap != null) {
                    ri8Var2.f = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                }
                map.put(str, ri8Var2);
            }
        }
        this.e = fC;
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            sb.append(((tu7) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
