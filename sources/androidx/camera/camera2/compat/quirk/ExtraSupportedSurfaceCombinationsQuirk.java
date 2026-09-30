package androidx.camera.camera2.compat.quirk;

import defpackage.g3e;
import defpackage.g9b;
import defpackage.n3e;
import defpackage.qd0;
import defpackage.ub3;
import defpackage.v9e;
import defpackage.w9e;
import defpackage.y9e;
import defpackage.z7c;
import defpackage.z9e;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;", "Lg9b;", "kj0", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class ExtraSupportedSurfaceCombinationsQuirk implements g9b {
    public static final v9e a;
    public static final v9e b;
    public static final Set c;
    public static final Set d;

    static {
        v9e v9eVar = new v9e();
        n3e n3eVar = z9e.e;
        w9e w9eVar = w9e.VGA;
        n3e n3eVar2 = z9e.e;
        y9e y9eVar = y9e.b;
        v9eVar.a(g3e.c(y9eVar, w9eVar, n3eVar2));
        w9e w9eVar2 = w9e.PREVIEW;
        y9e y9eVar2 = y9e.a;
        v9eVar.a(g3e.c(y9eVar2, w9eVar2, n3eVar2));
        w9e w9eVar3 = w9e.MAXIMUM;
        v9eVar.a(g3e.c(y9eVar, w9eVar3, n3eVar2));
        a = v9eVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(g3e.c(y9eVar, w9eVar, n3eVar2));
        arrayList.add(g3e.c(y9eVar, w9eVar2, n3eVar2));
        arrayList.add(g3e.c(y9eVar, w9eVar3, n3eVar2));
        v9e v9eVar2 = new v9e();
        ub3.s(v9eVar2, g3e.c(y9eVar2, w9eVar2, n3eVar2), y9eVar2, w9eVar, n3eVar2);
        v9eVar2.a(g3e.c(y9eVar, w9eVar3, n3eVar2));
        b = v9eVar2;
        c = qd0.I0(new String[]{"PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO", "PIXEL 9", "PIXEL 9 PRO", "PIXEL 9 PRO XL", "PIXEL 9 PRO FOLD"});
        d = qd0.I0(new String[]{"SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26", "SM-S931", "SM-S936", "SM-S937", "SM-S938", "SCG31", "SCG32", "SC-51F", "SC-52F"});
    }
}
