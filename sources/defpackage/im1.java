package defpackage;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class im1 {
    public static final no0 f = new no0("camerax.core.captureConfig.rotation", Integer.TYPE, null);
    public static final no0 g = new no0("camerax.core.captureConfig.jpegQuality", Integer.class, null);
    public static final no0 h = new no0("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);
    public final ArrayList a;
    public final bs9 b;
    public final int c;
    public final List d;
    public final wde e;

    public im1(ArrayList arrayList, bs9 bs9Var, int i, ArrayList arrayList2, wde wdeVar) {
        this.a = arrayList;
        this.b = bs9Var;
        this.c = i;
        this.d = Collections.unmodifiableList(arrayList2);
        this.e = wdeVar;
    }

    public final Range a() {
        Range range = (Range) this.b.a(h, hq0.h);
        Objects.requireNonNull(range);
        return range;
    }
}
