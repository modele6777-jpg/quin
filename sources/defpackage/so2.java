package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.draw.photo.homepage.SpreadInfoInputRoute;
import ai.askquin.ui.draw.photo.homepage.SpreadPreviewRoute;
import ai.askquin.ui.onboard.OnboardBirthdayRoute;
import ai.askquin.ui.onboard.OnboardNotificationRoute;
import ai.askquin.ui.onboard.OnboardOverviewRoute;
import ai.askquin.ui.onboard.model.UserIntentionType;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.filament.Engine;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.Texture;
import com.google.android.filament.TextureSampler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class so2 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ so2(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        Bitmap bitmapCreateBitmap;
        int i = this.a;
        int i2 = 5;
        final int i3 = 3;
        final int i4 = 2;
        int i5 = 27;
        boolean z = true;
        boolean z2 = true;
        final int i6 = 0;
        wef wefVar = wef.a;
        final boolean z3 = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                final mma mmaVar = (mma) obj2;
                ((ra4) obj).getClass();
                da9 da9Var = (da9) ((e89) obj3).getValue();
                if (da9Var == null) {
                    return new ou(i4);
                }
                u48 u48Var = new u48() { // from class: zo2
                    /* JADX WARN: Code duplicated, block: B:53:0x00b3 A[Catch: all -> 0x005c, TryCatch #0 {all -> 0x005c, blocks: (B:22:0x004a, B:24:0x0057, B:27:0x005f, B:30:0x0065, B:32:0x006f, B:34:0x007d, B:36:0x0081, B:37:0x0083, B:40:0x008e, B:42:0x0095, B:44:0x009b, B:53:0x00b3, B:46:0x009f, B:48:0x00a9, B:51:0x00af, B:54:0x00c2, B:56:0x00cd, B:57:0x00d0, B:59:0x00de, B:60:0x00e0), top: B:65:0x0048 }] */
                    @Override // defpackage.u48
                    public final void h(x48 x48Var, f48 f48Var) {
                        switch (i6) {
                            case 0:
                                mma mmaVar2 = (mma) mmaVar;
                                boolean z4 = z3;
                                if (f48Var == f48.ON_RESUME) {
                                    synchronized (mmaVar2.S0) {
                                        try {
                                            if (z4) {
                                                mmaVar2.t();
                                                mmaVar2.g1 = Boolean.TRUE;
                                                if (mmaVar2.Y0 == jr5.b) {
                                                    mmaVar2.Y0 = jr5.c;
                                                }
                                                mmaVar2.S();
                                            } else {
                                                mmaVar2.Y0 = jr5.a;
                                                mmaVar2.Z0 = false;
                                                if (!mmaVar2.b1 && !((Boolean) mmaVar2.c1.getValue()).booleanValue() && !mmaVar2.f1) {
                                                    mmaVar2.a1 = false;
                                                }
                                                Boolean bool = mmaVar2.g1;
                                                Boolean bool2 = Boolean.FALSE;
                                                if (!pa7.t(bool, bool2)) {
                                                    mmaVar2.g1 = bool2;
                                                    lyd lydVar = mmaVar2.U0;
                                                    if (lydVar != null && lydVar.b() && mmaVar2.W0) {
                                                        s0e s0eVar = mmaVar2.H0;
                                                        s0eVar.getClass();
                                                        s0eVar.n(null, bool2);
                                                        mmaVar2.M();
                                                        mmaVar2.S();
                                                    } else {
                                                        Object value = mmaVar2.F0.getValue();
                                                        pua puaVar = value instanceof pua ? (pua) value : null;
                                                        if (puaVar == null || !puaVar.e) {
                                                            mmaVar2.T0++;
                                                            lyd lydVar2 = mmaVar2.U0;
                                                            if (lydVar2 != null) {
                                                                lydVar2.h(null);
                                                            }
                                                            mmaVar2.U0 = null;
                                                            mmaVar2.V0 = false;
                                                            if (mmaVar2.F0.getValue() instanceof wua) {
                                                                mmaVar2.m1 = null;
                                                            }
                                                            mmaVar2.C();
                                                            mmaVar2.F0.m(null);
                                                            s0e s0eVar2 = mmaVar2.H0;
                                                            s0eVar2.getClass();
                                                            s0eVar2.n(null, bool2);
                                                            mmaVar2.n1 = false;
                                                            mmaVar2.M();
                                                            mmaVar2.S();
                                                        } else {
                                                            s0e s0eVar3 = mmaVar2.H0;
                                                            s0eVar3.getClass();
                                                            s0eVar3.n(null, bool2);
                                                            mmaVar2.M();
                                                            mmaVar2.S();
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    return;
                                }
                                return;
                            default:
                                ExoPlayer exoPlayer = (ExoPlayer) mmaVar;
                                boolean z5 = z3;
                                int i7 = buf.a[f48Var.ordinal()];
                                if (i7 != 1) {
                                    if (i7 != 2) {
                                        return;
                                    }
                                    ((y45) exoPlayer).P(false);
                                    return;
                                } else {
                                    if (!z5) {
                                        ((y45) exoPlayer).P(false);
                                        return;
                                    }
                                    y45 y45Var = (y45) exoPlayer;
                                    if (y45Var.r() == 1) {
                                        y45Var.D();
                                    }
                                    y45Var.P(true);
                                    y45Var.P(true);
                                    return;
                                }
                        }
                    }
                };
                da9Var.v.j.a(u48Var);
                return new oe0(i2, da9Var, u48Var);
            case 1:
                l1f l1fVar = (l1f) obj;
                kv2.y(l1fVar, "action", "open_box", "via", (String) obj3);
                l1fVar.a("my_tarot_deck", "pathway");
                l1fVar.a(urg.r((TarotSkinIdentify) obj2), "deck_id");
                l1fVar.a(z3 ? "1" : "0", "locked");
                return wefVar;
            case 2:
                final da9 da9Var2 = (da9) obj3;
                final List list = (List) obj2;
                u48 u48Var2 = new u48() { // from class: m84
                    @Override // defpackage.u48
                    public final void h(x48 x48Var, f48 f48Var) {
                        boolean z4 = z3;
                        List list2 = list;
                        da9 da9Var3 = da9Var2;
                        if (z4 && !list2.contains(da9Var3)) {
                            list2.add(da9Var3);
                        }
                        if (f48Var == f48.ON_START && !list2.contains(da9Var3)) {
                            list2.add(da9Var3);
                        }
                        if (f48Var == f48.ON_STOP) {
                            list2.remove(da9Var3);
                        }
                    }
                };
                da9Var2.v.j.a(u48Var2);
                return new oe0(12, da9Var2, u48Var2);
            case 3:
                e89 e89Var = (e89) obj3;
                e89 e89Var2 = (e89) obj2;
                x16 x16Var = (x16) obj;
                x16Var.getClass();
                if (z3) {
                    x16Var.invoke();
                } else {
                    e89Var.setValue(x16Var);
                    e89Var2.setValue(Boolean.TRUE);
                }
                return wefVar;
            case 4:
                p86 p86Var = (p86) obj3;
                v08 v08Var = (v08) obj;
                v08Var.getClass();
                List list2 = p86Var.b;
                v08Var.X(list2.size(), new d5(11, new sz5(4), list2), new gj(5, list2, false), new dd2(new ma6(list2, p86Var, (a26) obj2, z3), true, 2039820996));
                return wefVar;
            case 5:
                cb9 cb9Var = (cb9) obj3;
                Context context = (Context) obj2;
                ((UserIntentionType) obj).getClass();
                if (z3) {
                    ka9.e(cb9Var, OnboardBirthdayRoute.INSTANCE, null, 6);
                } else {
                    hs3 hs3Var = xqa.a;
                    boolean zBooleanValue = ((Boolean) z5c.I(nu4.a, new vo9(hs3Var.a, hs3Var.b, null))).booleanValue();
                    boolean zK = uyb.k(context);
                    y93 y93Var = y93.a;
                    boolean z4 = y93.e() != null;
                    boolean z5 = y93.h() != null;
                    ca2.a.getClass();
                    if (!ap9.d(zK, z4, z5, zBooleanValue, ca2.c)) {
                        ka9.e(cb9Var, new OnboardNotificationRoute(z3), null, 6);
                    } else if (z3) {
                        ka9.e(cb9Var, OnboardOverviewRoute.INSTANCE, null, 6);
                    } else {
                        ap9.b(context, (3 & 1) == 0, true);
                    }
                }
                return wefVar;
            case 6:
                final yx9 yx9Var = (yx9) obj3;
                final aw2 aw2Var = (aw2) obj2;
                hxc hxcVar = (hxc) obj;
                if (z3) {
                    x16 x16Var2 = new x16() { // from class: kx9
                        @Override // defpackage.x16
                        public final Object invoke() {
                            int i7 = i6;
                            boolean z6 = false;
                            aw2 aw2Var2 = aw2Var;
                            yx9 yx9Var2 = yx9Var;
                            switch (i7) {
                                case 0:
                                    if (yx9Var2.c()) {
                                        ynb.V(aw2Var2, null, null, new lx9(yx9Var2, null), 3);
                                        z6 = true;
                                    }
                                    return Boolean.valueOf(z6);
                                case 1:
                                    if (yx9Var2.d()) {
                                        ynb.V(aw2Var2, null, null, new mx9(yx9Var2, null), 3);
                                        z6 = true;
                                    }
                                    return Boolean.valueOf(z6);
                                case 2:
                                    if (yx9Var2.c()) {
                                        ynb.V(aw2Var2, null, null, new lx9(yx9Var2, null), 3);
                                        z6 = true;
                                    }
                                    return Boolean.valueOf(z6);
                                default:
                                    if (yx9Var2.d()) {
                                        ynb.V(aw2Var2, null, null, new mx9(yx9Var2, null), 3);
                                        z6 = true;
                                    }
                                    return Boolean.valueOf(z6);
                            }
                        }
                    };
                    wn7[] wn7VarArr = exc.a;
                    hxcVar.c(swc.y, new f6(null, x16Var2));
                    final boolean z6 = z ? 1 : 0;
                    hxcVar.c(swc.A, new f6(null, new x16() { // from class: kx9
                        @Override // defpackage.x16
                        public final Object invoke() {
                            int i7 = z6;
                            boolean z7 = false;
                            aw2 aw2Var2 = aw2Var;
                            yx9 yx9Var2 = yx9Var;
                            switch (i7) {
                                case 0:
                                    if (yx9Var2.c()) {
                                        ynb.V(aw2Var2, null, null, new lx9(yx9Var2, null), 3);
                                        z7 = true;
                                    }
                                    return Boolean.valueOf(z7);
                                case 1:
                                    if (yx9Var2.d()) {
                                        ynb.V(aw2Var2, null, null, new mx9(yx9Var2, null), 3);
                                        z7 = true;
                                    }
                                    return Boolean.valueOf(z7);
                                case 2:
                                    if (yx9Var2.c()) {
                                        ynb.V(aw2Var2, null, null, new lx9(yx9Var2, null), 3);
                                        z7 = true;
                                    }
                                    return Boolean.valueOf(z7);
                                default:
                                    if (yx9Var2.d()) {
                                        ynb.V(aw2Var2, null, null, new mx9(yx9Var2, null), 3);
                                        z7 = true;
                                    }
                                    return Boolean.valueOf(z7);
                            }
                        }
                    }));
                } else {
                    x16 x16Var3 = new x16() { // from class: kx9
                        @Override // defpackage.x16
                        public final Object invoke() {
                            int i7 = i4;
                            boolean z7 = false;
                            aw2 aw2Var2 = aw2Var;
                            yx9 yx9Var2 = yx9Var;
                            switch (i7) {
                                case 0:
                                    if (yx9Var2.c()) {
                                        ynb.V(aw2Var2, null, null, new lx9(yx9Var2, null), 3);
                                        z7 = true;
                                    }
                                    return Boolean.valueOf(z7);
                                case 1:
                                    if (yx9Var2.d()) {
                                        ynb.V(aw2Var2, null, null, new mx9(yx9Var2, null), 3);
                                        z7 = true;
                                    }
                                    return Boolean.valueOf(z7);
                                case 2:
                                    if (yx9Var2.c()) {
                                        ynb.V(aw2Var2, null, null, new lx9(yx9Var2, null), 3);
                                        z7 = true;
                                    }
                                    return Boolean.valueOf(z7);
                                default:
                                    if (yx9Var2.d()) {
                                        ynb.V(aw2Var2, null, null, new mx9(yx9Var2, null), 3);
                                        z7 = true;
                                    }
                                    return Boolean.valueOf(z7);
                            }
                        }
                    };
                    wn7[] wn7VarArr2 = exc.a;
                    hxcVar.c(swc.z, new f6(null, x16Var3));
                    hxcVar.c(swc.B, new f6(null, new x16() { // from class: kx9
                        @Override // defpackage.x16
                        public final Object invoke() {
                            int i7 = i3;
                            boolean z7 = false;
                            aw2 aw2Var2 = aw2Var;
                            yx9 yx9Var2 = yx9Var;
                            switch (i7) {
                                case 0:
                                    if (yx9Var2.c()) {
                                        ynb.V(aw2Var2, null, null, new lx9(yx9Var2, null), 3);
                                        z7 = true;
                                    }
                                    return Boolean.valueOf(z7);
                                case 1:
                                    if (yx9Var2.d()) {
                                        ynb.V(aw2Var2, null, null, new mx9(yx9Var2, null), 3);
                                        z7 = true;
                                    }
                                    return Boolean.valueOf(z7);
                                case 2:
                                    if (yx9Var2.c()) {
                                        ynb.V(aw2Var2, null, null, new lx9(yx9Var2, null), 3);
                                        z7 = true;
                                    }
                                    return Boolean.valueOf(z7);
                                default:
                                    if (yx9Var2.d()) {
                                        ynb.V(aw2Var2, null, null, new mx9(yx9Var2, null), 3);
                                        z7 = true;
                                    }
                                    return Boolean.valueOf(z7);
                            }
                        }
                    }));
                }
                return wefVar;
            case 7:
                ka9 ka9Var = (ka9) obj3;
                SpreadInfoInputRoute spreadInfoInputRoute = (SpreadInfoInputRoute) obj2;
                List list3 = (List) obj;
                list3.getClass();
                if (z3) {
                    ka9Var.d(new q4a(27), new SpreadPreviewRoute(spreadInfoInputRoute.getCards(), list3));
                } else {
                    ka9.e(ka9Var, new SpreadPreviewRoute(spreadInfoInputRoute.getCards(), list3), null, 6);
                }
                return wefVar;
            case 8:
                l1f l1fVar2 = (l1f) obj;
                l1fVar2.getClass();
                l1fVar2.a((String) obj3, "page_name");
                l1fVar2.a(Boolean.valueOf(z3), "is_revisit");
                l1fVar2.a((String) obj2, "seasonal_period");
                return wefVar;
            case 9:
                String str = (String) obj3;
                fqd fqdVar = (fqd) obj2;
                hxc hxcVar2 = (hxc) obj;
                if (z3) {
                    exc.j(hxcVar2, 0);
                }
                hla hlaVar = new hla(i5, fqdVar);
                wn7[] wn7VarArr3 = exc.a;
                hxcVar2.c(swc.v, new f6(null, hlaVar));
                exc.k(hxcVar2, str);
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                hhe hheVar = (hhe) obj3;
                ihe iheVar = (ihe) obj2;
                List list4 = (List) obj;
                list4.getClass();
                Engine engine = hheVar.a;
                Texture texture = hheVar.m;
                TextureSampler textureSampler = hheVar.r;
                ArrayList arrayList = hheVar.q.b;
                ArrayList arrayListB = xge.b(engine, list4);
                try {
                    int i7 = 0;
                    for (Object obj4 : arrayListB) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            t72.Z();
                            throw null;
                        }
                        ((MaterialInstance) arrayList.get(i7)).c("baseColorMap", (Texture) obj4, textureSampler);
                        i7 = i8;
                    }
                    float f = z3 ? 1.0f : 0.0f;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((MaterialInstance) it.next()).b("overlayAmount", f);
                    }
                    if (iheVar.b(hheVar)) {
                        ByteBuffer byteBuffer = hheVar.s;
                        cge cgeVar = iheVar.a;
                        bitmapCreateBitmap = Bitmap.createBitmap(cgeVar.d, cgeVar.e, Bitmap.Config.ARGB_8888);
                        bitmapCreateBitmap.getClass();
                        byteBuffer.position(0);
                        bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer);
                    } else {
                        bitmapCreateBitmap = null;
                    }
                    xfe xfeVar = bitmapCreateBitmap != null ? new xfe(bitmapCreateBitmap, lhe.a((Bitmap) list4.get(1))) : null;
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((MaterialInstance) it2.next()).c("baseColorMap", texture, textureSampler);
                    }
                    engine.w();
                    Iterator it3 = arrayListB.iterator();
                    while (it3.hasNext()) {
                        engine.t((Texture) it3.next());
                    }
                    engine.w();
                    return xfeVar;
                } catch (Throwable th) {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        ((MaterialInstance) it4.next()).c("baseColorMap", texture, textureSampler);
                    }
                    engine.w();
                    Iterator it5 = arrayListB.iterator();
                    while (it5.hasNext()) {
                        engine.t((Texture) it5.next());
                    }
                    engine.w();
                    throw th;
                }
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                x48 x48Var = (x48) obj3;
                final ExoPlayer exoPlayer = (ExoPlayer) obj2;
                ((ra4) obj).getClass();
                if (((a58) x48Var.k()).i.compareTo(g48.e) >= 0) {
                    if (z3) {
                        y45 y45Var = (y45) exoPlayer;
                        if (y45Var.r() == 1) {
                            y45Var.D();
                        }
                        y45Var.P(true);
                        y45Var.P(true);
                    } else {
                        ((y45) exoPlayer).P(false);
                    }
                } else if (!z3) {
                    ((y45) exoPlayer).P(false);
                }
                final boolean z7 = z2 ? 1 : 0;
                u48 u48Var3 = new u48() { // from class: zo2
                    /* JADX WARN: Code duplicated, block: B:53:0x00b3 A[Catch: all -> 0x005c, TryCatch #0 {all -> 0x005c, blocks: (B:22:0x004a, B:24:0x0057, B:27:0x005f, B:30:0x0065, B:32:0x006f, B:34:0x007d, B:36:0x0081, B:37:0x0083, B:40:0x008e, B:42:0x0095, B:44:0x009b, B:53:0x00b3, B:46:0x009f, B:48:0x00a9, B:51:0x00af, B:54:0x00c2, B:56:0x00cd, B:57:0x00d0, B:59:0x00de, B:60:0x00e0), top: B:65:0x0048 }] */
                    @Override // defpackage.u48
                    public final void h(x48 x48Var2, f48 f48Var) {
                        switch (z7) {
                            case 0:
                                mma mmaVar2 = (mma) exoPlayer;
                                boolean z8 = z3;
                                if (f48Var == f48.ON_RESUME) {
                                    synchronized (mmaVar2.S0) {
                                        try {
                                            if (z8) {
                                                mmaVar2.t();
                                                mmaVar2.g1 = Boolean.TRUE;
                                                if (mmaVar2.Y0 == jr5.b) {
                                                    mmaVar2.Y0 = jr5.c;
                                                }
                                                mmaVar2.S();
                                            } else {
                                                mmaVar2.Y0 = jr5.a;
                                                mmaVar2.Z0 = false;
                                                if (!mmaVar2.b1 && !((Boolean) mmaVar2.c1.getValue()).booleanValue() && !mmaVar2.f1) {
                                                    mmaVar2.a1 = false;
                                                }
                                                Boolean bool = mmaVar2.g1;
                                                Boolean bool2 = Boolean.FALSE;
                                                if (!pa7.t(bool, bool2)) {
                                                    mmaVar2.g1 = bool2;
                                                    lyd lydVar = mmaVar2.U0;
                                                    if (lydVar != null && lydVar.b() && mmaVar2.W0) {
                                                        s0e s0eVar3 = mmaVar2.H0;
                                                        s0eVar3.getClass();
                                                        s0eVar3.n(null, bool2);
                                                        mmaVar2.M();
                                                        mmaVar2.S();
                                                    } else {
                                                        Object value = mmaVar2.F0.getValue();
                                                        pua puaVar = value instanceof pua ? (pua) value : null;
                                                        if (puaVar == null || !puaVar.e) {
                                                            mmaVar2.T0++;
                                                            lyd lydVar2 = mmaVar2.U0;
                                                            if (lydVar2 != null) {
                                                                lydVar2.h(null);
                                                            }
                                                            mmaVar2.U0 = null;
                                                            mmaVar2.V0 = false;
                                                            if (mmaVar2.F0.getValue() instanceof wua) {
                                                                mmaVar2.m1 = null;
                                                            }
                                                            mmaVar2.C();
                                                            mmaVar2.F0.m(null);
                                                            s0e s0eVar2 = mmaVar2.H0;
                                                            s0eVar2.getClass();
                                                            s0eVar2.n(null, bool2);
                                                            mmaVar2.n1 = false;
                                                            mmaVar2.M();
                                                            mmaVar2.S();
                                                        } else {
                                                            s0e s0eVar4 = mmaVar2.H0;
                                                            s0eVar4.getClass();
                                                            s0eVar4.n(null, bool2);
                                                            mmaVar2.M();
                                                            mmaVar2.S();
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                    return;
                                }
                                return;
                            default:
                                ExoPlayer exoPlayer2 = (ExoPlayer) exoPlayer;
                                boolean z9 = z3;
                                int i9 = buf.a[f48Var.ordinal()];
                                if (i9 != 1) {
                                    if (i9 != 2) {
                                        return;
                                    }
                                    ((y45) exoPlayer2).P(false);
                                    return;
                                } else {
                                    if (!z9) {
                                        ((y45) exoPlayer2).P(false);
                                        return;
                                    }
                                    y45 y45Var2 = (y45) exoPlayer2;
                                    if (y45Var2.r() == 1) {
                                        y45Var2.D();
                                    }
                                    y45Var2.P(true);
                                    y45Var2.P(true);
                                    return;
                                }
                        }
                    }
                };
                x48Var.k().a(u48Var3);
                return new ozc(13, x48Var, u48Var3);
            default:
                fxf fxfVar = (fxf) obj3;
                a26 a26Var = (a26) obj2;
                exf exfVar = (exf) obj;
                if (exfVar.getAttachedState() != fxfVar) {
                    fxfVar.f = exfVar;
                    exfVar.setAttachedState(fxfVar);
                    a26Var.d(fxfVar);
                }
                if (e77.b(0L, 0L)) {
                    exfVar.getHolder().setSizeFromLayout();
                } else {
                    exfVar.getHolder().setFixedSize(0, 0);
                }
                exfVar.getHolder().setFormat(z3 ? -1 : -3);
                exfVar.setSecure(false);
                return wefVar;
        }
    }

    public /* synthetic */ so2(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public /* synthetic */ so2(boolean z, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }
}
