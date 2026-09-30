package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.annual.ResumeRoute;
import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import tech.chatmind.api.CloudMixedDeckSnapshot;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class eb3 {
    public static final dd2 a = new dd2(new ld2(), false, -1571120048);
    public static final dd2 b = new dd2(new kd2(4), false, -1455401925);
    public static final dd2 c = new dd2(new yd2(17), false, -1673764858);
    public static final dd2 d = new dd2(new ce2(27), false, -967662299);
    public static final n82 e = n82.z;
    public static final n82 f = n82.v;
    public static final float g = 0.1f;
    public static final n82 v = n82.w;
    public static final float w = 0.38f;
    public static final float x = 1.0f;
    public static final n82 y = n82.e;
    public static final n82 z = n82.E0;
    public static final float X = 3.0f;
    public static final g5d Y = g5d.b;

    public static final void A(iec iecVar) {
        iecVar.getClass();
        if (iecVar instanceof ryc) {
            qc0.p("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (iecVar instanceof fua) {
            qc0.p("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (iecVar instanceof zia) {
            qc0.p("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String B(wg7 wg7Var, nyc nycVar) {
        nycVar.getClass();
        wg7Var.getClass();
        for (Annotation annotation : nycVar.getAnnotations()) {
            if (annotation instanceof ch7) {
                return ((ch7) annotation).discriminator();
            }
        }
        return wg7Var.a.g;
    }

    public static final j09 C(j09 j09Var, rh5 rh5Var) {
        return j09Var.D(new uef(rh5Var));
    }

    public static final j09 E(j09 j09Var, xw9 xw9Var) {
        return j09Var.D(new yw9(xw9Var));
    }

    public static final ke6 F(vv7 vv7Var, xh6 xh6Var, float f2, long j, long j2) {
        long jJ0 = db6.J0(ald.f(j, f2));
        if (((int) (jJ0 >> 32)) <= 0 || ((int) (4294967295L & jJ0)) <= 0) {
            return null;
        }
        ke6 ke6VarC = ((ie6) H(xh6Var, zg2.g)).c();
        vv7Var.F0(jJ0, new s01(xh6Var, f2, j2), ke6VarC);
        return ke6VarC;
    }

    public static ewf G(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (ewf) objNewInstance;
            } catch (IllegalAccessException e2) {
                cva.p("Cannot create an instance of ", cls, e2);
                return null;
            } catch (InstantiationException e3) {
                cva.p("Cannot create an instance of ", cls, e3);
                return null;
            }
        } catch (NoSuchMethodException e4) {
            cva.p("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object H(ug2 ug2Var, b1b b1bVar) {
        if (!((i09) ug2Var).a.Y) {
            i37.c("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        u8a u8aVar = (u8a) vd0.s0(ug2Var).R0;
        u8aVar.getClass();
        return od4.B(u8aVar, b1bVar);
    }

    public static final void I(sn4 sn4Var, long j, long j2, boolean z2, a26 a26Var) {
        float fMax = Math.max(Float.intBitsToFloat((int) (sn4Var.f() >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (sn4Var.f() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L));
        ta0 ta0VarV0 = sn4Var.v0();
        long jZ = ta0VarV0.z();
        ta0VarV0.p().g();
        try {
            vd9 vd9Var = (vd9) ta0VarV0.c;
            if (z2) {
                vd9Var.l(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
            }
            if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0 || hl9.c(j, 0L)) {
                ta0 ta0VarV1 = sn4Var.v0();
                long jZ2 = ta0VarV1.z();
                ta0VarV1.p().g();
                try {
                    ((vd9) ta0VarV1.c).G(fMax, fMax, 0L);
                    a26Var.d(sn4Var);
                    ta0VarV1.p().o();
                    ta0VarV1.R(jZ2);
                } catch (Throwable th) {
                    ta0VarV1.p().o();
                    ta0VarV1.R(jZ2);
                    throw th;
                }
            } else {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
                ((vd9) sn4Var.v0().c).I(fIntBitsToFloat3, fIntBitsToFloat4);
                try {
                    ta0 ta0VarV2 = sn4Var.v0();
                    long jZ3 = ta0VarV2.z();
                    ta0VarV2.p().g();
                    try {
                        ((vd9) ta0VarV2.c).G(fMax, fMax, 0L);
                        a26Var.d(sn4Var);
                        ta0VarV2.p().o();
                        ta0VarV2.R(jZ3);
                        ((vd9) sn4Var.v0().c).I(-fIntBitsToFloat3, -fIntBitsToFloat4);
                    } catch (Throwable th2) {
                        ta0VarV2.p().o();
                        ta0VarV2.R(jZ3);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    ((vd9) sn4Var.v0().c).I(-fIntBitsToFloat3, -fIntBitsToFloat4);
                    throw th3;
                }
            }
            ks0.t(ta0VarV0, jZ);
        } catch (Throwable th4) {
            ks0.t(ta0VarV0, jZ);
            throw th4;
        }
    }

    public static final void J(sn4 sn4Var, li6 li6Var, ug2 ug2Var, long j, long j2, b41 b41Var) {
        li6Var.getClass();
        b41 b41Var2 = li6Var.c;
        if (b41Var2 != null) {
            if (b41Var != null) {
                tm7.R(ug2Var, new r01(sn4Var, j, li6Var, b41Var));
                return;
            } else {
                sn4.O0(sn4Var, b41Var2, j, sn4Var.f(), 0.0f, null, null, li6Var.b, 56);
                return;
            }
        }
        if (b41Var != null) {
            sn4.O0(sn4Var, b41Var, j, sn4Var.f(), 0.0f, null, new xz0(li6Var.a, 5), 0, 88);
        } else {
            sn4.y0(sn4Var, li6Var.a, 0L, j2, 0.0f, null, li6Var.b, 58);
        }
    }

    public static final void K(q8c q8cVar) {
        q8cVar.getClass();
        c78 c78VarW = t72.w();
        x8c x8cVarW0 = q8cVar.W0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (x8cVarW0.R0()) {
            try {
                c78VarW.add(x8cVarW0.t0(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    cgg.t(x8cVarW0, th);
                    throw th2;
                }
            }
        }
        cgg.t(x8cVarW0, null);
        ListIterator listIterator = c78VarW.n().listIterator(0);
        while (true) {
            ql6 ql6Var = (ql6) listIterator;
            if (!ql6Var.hasNext()) {
                return;
            }
            String str = (String) ql6Var.next();
            if (c5e.C(str, "room_fts_content_sync_", false)) {
                p8c.o(q8cVar, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static final String L(TarotSkinIdentify tarotSkinIdentify) {
        tarotSkinIdentify.getClass();
        if (r8c.k(tarotSkinIdentify)) {
            tarotSkinIdentify = TarotSkinIdentify.Classic;
        }
        return hfc.h(tarotSkinIdentify).d();
    }

    public static boolean M(int i) {
        if (i == 8 || i == 7) {
            return true;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 31 || !(i == 26 || i == 27)) {
            return i2 >= 33 && i == 30;
        }
        return true;
    }

    public static lw7 N(z18 z18Var, x16 x16Var) {
        x16Var.getClass();
        int iOrdinal = z18Var.ordinal();
        if (iOrdinal == 0) {
            return new ace(x16Var);
        }
        if (iOrdinal == 1) {
            return new kcc(x16Var);
        }
        if (iOrdinal == 2) {
            return new sff(x16Var);
        }
        ap.c();
        return null;
    }

    public static ace O(x16 x16Var) {
        x16Var.getClass();
        return new ace(x16Var);
    }

    public static final j09 P(j09 j09Var, a26 a26Var) {
        return j09Var.D(new vl2(a26Var));
    }

    public static final TarotSkinIdentify Q(String str) {
        Object obj;
        Object next;
        str.getClass();
        Iterator<E> it = TarotSkinIdentify.getEntries().iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!pa7.t(((TarotSkinIdentify) next).name(), str));
        TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) next;
        if (tarotSkinIdentify != null) {
            return tarotSkinIdentify;
        }
        for (Object obj2 : TarotSkinIdentify.getEntries()) {
            if (pa7.t(L((TarotSkinIdentify) obj2), str)) {
                obj = obj2;
                break;
            }
        }
        return (TarotSkinIdentify) obj;
    }

    public static final ResumeRoute R(p40 p40Var) {
        Object dzbVar;
        String str = p40Var.a;
        try {
            xh7 xh7Var = fzc.a;
            xh7Var.getClass();
            dzbVar = (ResumeRoute) xh7Var.b(ResumeRoute.Companion.serializer(), str);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        if (dzbVar instanceof dzb) {
            dzbVar = null;
        }
        return (ResumeRoute) dzbVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object S(zhc zhcVar, float f2, zn2 zn2Var) {
        wgc wgcVar;
        jmb jmbVar;
        if (zn2Var instanceof wgc) {
            wgcVar = (wgc) zn2Var;
            int i = wgcVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                wgcVar.label = i - Integer.MIN_VALUE;
            } else {
                wgcVar = new wgc(zn2Var);
            }
        } else {
            wgcVar = new wgc(zn2Var);
        }
        Object obj = wgcVar.result;
        int i2 = wgcVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            jmb jmbVar2 = new jmb();
            l26 xgcVar = new xgc(jmbVar2, f2, null);
            wgcVar.L$0 = jmbVar2;
            wgcVar.label = 1;
            Object objB = zhcVar.b(s89.a, xgcVar, wgcVar);
            Object obj2 = bw2.a;
            if (objB == obj2) {
                return obj2;
            }
            jmbVar = jmbVar2;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jmbVar = (jmb) wgcVar.L$0;
            jzb.q(obj);
        }
        return new Float(jmbVar.element);
    }

    public static void T(int i, du7 du7Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            bp.K(du7Var, i != 0 ? bp.D(i) : null);
        } else if (i == 0) {
            du7Var.setXfermode(null);
        } else {
            PorterDuff.Mode modeK = m93.K(i);
            du7Var.setXfermode(modeK != null ? new PorterDuffXfermode(modeK) : null);
        }
    }

    public static Object U(zhc zhcVar, gbe gbeVar) {
        Object objB = zhcVar.b(s89.a, new ygc(2, null), gbeVar);
        return objB == bw2.a ? objB : wef.a;
    }

    public static final md5 V(File file) {
        int length;
        List list;
        int iN;
        file.getClass();
        String path = file.getPath();
        path.getClass();
        char c2 = File.separatorChar;
        int iN2 = v4e.N(path, c2, 0, 4);
        if (iN2 == 0) {
            if (path.length() <= 1 || path.charAt(1) != c2 || (iN = v4e.N(path, c2, 2, 4)) < 0) {
                length = 1;
            } else {
                int iN3 = v4e.N(path, c2, iN + 1, 4);
                length = iN3 >= 0 ? iN3 + 1 : path.length();
            }
        } else if (iN2 <= 0 || path.charAt(iN2 - 1) != ':') {
            length = (iN2 == -1 && v4e.I(path, ':')) ? path.length() : 0;
        } else {
            length = iN2 + 1;
        }
        String strSubstring = path.substring(0, length);
        String strSubstring2 = path.substring(length);
        if (strSubstring2.length() == 0) {
            list = pu4.a;
        } else {
            List listD0 = v4e.d0(strSubstring2, new char[]{c2}, 6);
            ArrayList arrayList = new ArrayList(t72.u(listD0, 10));
            Iterator it = listD0.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new md5(new File(strSubstring), list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public static final MixedDeckSnapshot W(CloudMixedDeckSnapshot cloudMixedDeckSnapshot, String str, MixedDeckSnapshot mixedDeckSnapshot) {
        List<String> cardOrder;
        str.getClass();
        lx4 entries = TarotCardType.getEntries();
        ?? arrayList = new ArrayList(t72.u(entries, 10));
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            arrayList.add(((TarotCardType) it.next()).getCardKey());
        }
        if (cloudMixedDeckSnapshot.getVersion() >= 1 && pa7.t(cloudMixedDeckSnapshot.getDeckIDsByCardKey().keySet(), s72.o1(arrayList))) {
            Collection<String> collectionValues = cloudMixedDeckSnapshot.getDeckIDsByCardKey().values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    if (v4e.Q((String) it2.next())) {
                    }
                }
            }
            Map<String, String> deckIDsByCardKey = cloudMixedDeckSnapshot.getDeckIDsByCardKey();
            if (mixedDeckSnapshot != null) {
                if (!pa7.t(mixedDeckSnapshot.getReadingId(), str) || !mixedDeckSnapshot.isValid()) {
                    mixedDeckSnapshot = null;
                }
                if (mixedDeckSnapshot != null && (cardOrder = mixedDeckSnapshot.getCardOrder()) != null) {
                    arrayList = cardOrder;
                }
            }
            return new MixedDeckSnapshot(str, deckIDsByCardKey, arrayList, cloudMixedDeckSnapshot.getVersion());
        }
        return null;
    }

    public static Object X(kg1 kg1Var, em7 em7Var) {
        em7Var.getClass();
        if (kg1Var instanceof yff) {
            return ((yff) kg1Var).H0(em7Var);
        }
        if (!(kg1Var instanceof ng1)) {
            return null;
        }
        ng1 ng1Var = (ng1) kg1Var;
        if (ng1Var.f() == kg1Var) {
            return null;
        }
        ng1 ng1VarF = ng1Var.f();
        ng1VarF.getClass();
        return X(ng1VarF, em7Var);
    }

    public static final j09 Y(j09 j09Var, g7g g7gVar) {
        return j09Var.D(new c57(g7gVar));
    }

    public static final void a(r12 r12Var, final l26 l26Var, final x16 x16Var, l46 l46Var, final int i) {
        r12 r12Var2;
        l26 l26Var2;
        l46 l46Var2;
        ojb ojbVarV;
        l26 l26Var3;
        int i2;
        final r12 r12Var3 = r12Var;
        l26Var.getClass();
        x16Var.getClass();
        l46Var.h0(-1709533670);
        int i3 = i | (l46Var.i(r12Var3) ? 4 : 2) | (l46Var.i(l26Var) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            int i4 = (i3 >> 3) & 112;
            rxg.a(false, x16Var, l46Var, i4, 1);
            if (mh3.S(null, x16Var, l46Var, i4, 1)) {
                l26Var2 = l26Var;
                u12 u12Var = (u12) r12Var3.v.getValue();
                i8c i8cVar = sf2.a;
                if (u12Var == null) {
                    l46Var.f0(1004971055);
                    String str = r12Var3.c;
                    List list = (List) r12Var3.g.getValue();
                    int i5 = i3 & 14;
                    boolean z2 = i5 == 4 || l46Var.i(r12Var3);
                    Object objR = l46Var.R();
                    if (z2 || objR == i8cVar) {
                        i2 = i5;
                        q12 q12Var = new q12(2, r12Var, r12.class, "createNewCard", "createNewCard(I)Ltech/chatmind/api/TarotCardChoice;", 4, 0);
                        r12Var3 = r12Var;
                        l46Var.p0(q12Var);
                        objR = q12Var;
                    } else {
                        i2 = i5;
                    }
                    l26 l26Var4 = (l26) objR;
                    boolean z3 = i2 == 4 || l46Var.i(r12Var3);
                    Object objR2 = l46Var.R();
                    if (z3 || objR2 == i8cVar) {
                        objR2 = new gl(2, r12Var, r12.class, "confirmCard", "confirmCard(Ltech/chatmind/api/TarotCardChoice;I)V", 0, 2);
                        r12Var2 = r12Var;
                        l46Var.p0(objR2);
                    } else {
                        r12Var2 = r12Var3;
                    }
                    h(str, list, l26Var4, (l26) ((ym7) objR2), x16Var, l46Var, (i3 << 6) & 57344);
                    l46Var2 = l46Var;
                    l46Var2.r(false);
                } else {
                    r12Var2 = r12Var3;
                    l46Var2 = l46Var;
                    l46Var2.f0(1005222651);
                    String str2 = r12Var2.c;
                    TarotCardChoice tarotCardChoice = u12Var.a;
                    boolean zI = l46Var2.i(u12Var) | ((i3 & 112) == 32);
                    Object objR3 = l46Var2.R();
                    if (zI || objR3 == i8cVar) {
                        objR3 = new ad1(5, l26Var2, u12Var);
                        l46Var2.p0(objR3);
                    }
                    e(str2, tarotCardChoice, (x16) objR3, x16Var, l46Var2, (i3 << 3) & 7168);
                    l46Var2.r(false);
                }
            } else {
                ojbVarV = l46Var.v();
                if (ojbVarV == null) {
                    return;
                }
                final int i6 = 0;
                l26Var3 = new l26(r12Var3, l26Var, x16Var, i, i6) { // from class: p12
                    public final /* synthetic */ int a;
                    public final /* synthetic */ r12 b;
                    public final /* synthetic */ l26 c;
                    public final /* synthetic */ x16 d;

                    {
                        this.a = i6;
                    }

                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        int i7 = this.a;
                        wef wefVar = wef.a;
                        x16 x16Var2 = this.d;
                        l26 l26Var5 = this.c;
                        r12 r12Var4 = this.b;
                        l46 l46Var3 = (l46) obj;
                        ((Integer) obj2).getClass();
                        switch (i7) {
                            case 0:
                                eb3.a(r12Var4, l26Var5, x16Var2, l46Var3, k99.P(9));
                                break;
                            default:
                                eb3.a(r12Var4, l26Var5, x16Var2, l46Var3, k99.P(9));
                                break;
                        }
                        return wefVar;
                    }
                };
            }
            ojbVarV.d = l26Var3;
        }
        r12Var2 = r12Var3;
        l26Var2 = l26Var;
        l46Var2 = l46Var;
        l46Var2.Z();
        ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            final int i7 = 1;
            final r12 r12Var4 = r12Var2;
            final l26 l26Var5 = l26Var2;
            l26Var3 = new l26(r12Var4, l26Var5, x16Var, i, i7) { // from class: p12
                public final /* synthetic */ int a;
                public final /* synthetic */ r12 b;
                public final /* synthetic */ l26 c;
                public final /* synthetic */ x16 d;

                {
                    this.a = i7;
                }

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    int i8 = this.a;
                    wef wefVar = wef.a;
                    x16 x16Var2 = this.d;
                    l26 l26Var6 = this.c;
                    r12 r12Var5 = this.b;
                    l46 l46Var3 = (l46) obj;
                    ((Integer) obj2).getClass();
                    switch (i8) {
                        case 0:
                            eb3.a(r12Var5, l26Var6, x16Var2, l46Var3, k99.P(9));
                            break;
                        default:
                            eb3.a(r12Var5, l26Var6, x16Var2, l46Var3, k99.P(9));
                            break;
                    }
                    return wefVar;
                }
            };
            ojbVarV.d = l26Var3;
        }
    }

    public static final void e(String str, TarotCardChoice tarotCardChoice, x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        int i2;
        l46Var.h0(-664768345);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(tarotCardChoice) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        int i3 = 1;
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            pr4 pr4Var = l8b.a;
            xdc.a(b.c, af1.b0(106676587, new m(15, x16Var2), l46Var), af1.b0(-595919252, new xh1(k8b.f((e8b) l46Var.k(pr4Var)) ? 24.0f : 32.0f, x16Var, i3), l46Var), null, null, 0, ((e8b) l46Var.k(pr4Var)).a, 0L, null, af1.b0(-882072266, new w7(11, tarotCardChoice, str), l46Var), l46Var, 805306806, 440);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rb(str, tarotCardChoice, x16Var, x16Var2, i, 6);
        }
    }

    public static final void f(x16 x16Var, l46 l46Var, int i) {
        l46Var.h0(1832957911);
        int i2 = (l46Var.i(x16Var) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            j09 j09VarB0 = ynb.b0(8.0f, 0.0f, b.d(mh3.W(b.c(g09.a, 1.0f)), 64.0f), 2);
            xn8 xn8VarC = s21.c(ndb.e, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarB0);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            c8b.a(null, false, k8b.e((e8b) l46Var.k(l8b.a)), 0L, x16Var, l46Var, (i2 << 12) & 57344, 11);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new m(i, 13, x16Var);
        }
    }

    public static final void h(String str, List list, l26 l26Var, l26 l26Var2, x16 x16Var, l46 l46Var, int i) {
        int i2;
        Object obj;
        l46Var.h0(1902441367);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? l46Var.g(list) : l46Var.i(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? l46Var.g(l26Var) : l46Var.i(l26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            obj = l26Var2;
            i2 |= l46Var.i(obj) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        } else {
            obj = l26Var2;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            xdc.a(b.c, af1.b0(-1703838381, new m(14, x16Var), l46Var), null, null, null, 0, ((e8b) l46Var.k(l8b.a)).a, 0L, null, af1.b0(903757928, new sz7(list, l26Var, obj, str, 4), l46Var), l46Var, 805306422, 444);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new yb(str, list, l26Var, l26Var2, x16Var, i);
        }
    }

    public static final void i(j09 j09Var, use useVar, String str, boolean z2, a26 a26Var, l46 l46Var, int i) {
        use useVar2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1916996817);
        int i2 = i | (l46Var2.g(useVar) ? 32 : 16) | (l46Var2.g(str) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.i(a26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        int i3 = 0;
        if (l46Var2.W(i2 & 1, (i2 & 8339) != 8338)) {
            l46Var2.b0();
            if ((i & 1) != 0 && !l46Var2.C()) {
                l46Var2.Z();
            }
            l46Var2.s();
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = zrd.b(new zr1(useVar, 5));
                l46Var2.p0(objR);
            }
            h0e h0eVar = (h0e) objR;
            c92 c92VarA = a92.a(new uc0(24.0f, true, new qc0(i3)), ndb.Y, l46Var2, 6);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09Var);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, c92VarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            boolean z3 = false;
            int i4 = i2 & 112;
            cn1.j(b.b(0.0f, k8b.e((e8b) l46Var2.k(l8b.a)) ? 48.0f : 56.0f, b.c(j09Var, 1.0f), 1), useVar, str, null, 0L, new wo7(6, 0, 123), gec.x, null, null, qk6.v0(0L, 0L, 0L, eze.a(l46Var2).b.w(l46Var2), eze.a(l46Var2).b.w(l46Var2), 0L, eze.a(l46Var2).b.w(l46Var2), 0L, eze.a(l46Var2).b.x(l46Var2), eze.a(l46Var2).b.x(l46Var2), 0L, 0L, 0L, l46Var, 2147477327), new bx9(24.0f, 12.0f, 24.0f, 12.0f), mue.a((mue) l46Var2.k(nte.a), ((m82) l46Var2.k(o82.a)).q, w6c.l(17), null, null, 0L, null, 0, w6c.l(24), null, null, 16646140), eze.a(l46Var).a.j, false, 0.0f, 0.0f, l46Var, i4 | 1769472 | (i2 & 896), 6, 57752);
            useVar2 = useVar;
            l46Var2 = l46Var;
            String strQ = afc.q(R.string.auth_using_email, l46Var2);
            j09 j09VarB = b.b(0.0f, 56.0f, b.c(g09.a, 1.0f), 1);
            boolean zBooleanValue = ((Boolean) h0eVar.getValue()).booleanValue();
            u51 u51VarM = c8b.m(l46Var2);
            boolean z4 = (i2 & 57344) == 16384;
            if (((i4 ^ 48) > 32 && l46Var2.g(useVar2)) || (i2 & 48) == 32) {
                z3 = true;
            }
            boolean z5 = z3 | z4;
            Object objR2 = l46Var2.R();
            if (z5 || objR2 == i8cVar) {
                objR2 = new y7(a26Var, useVar2, 2);
                l46Var2.p0(objR2);
            }
            c8b.j(j09VarB, strQ, zBooleanValue, null, 0.0f, null, u51VarM, null, false, (x16) objR2, l46Var2, 6, 440);
            l46Var2.r(true);
        } else {
            useVar2 = useVar;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l30(j09Var, useVar2, str, z2, a26Var, i);
        }
    }

    public static final void j(l06 l06Var, x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        l46 l46Var2;
        ov7 ov7Var;
        l46Var.h0(-450705469);
        int i2 = i | (l46Var.g(l06Var) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i3 = 0;
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            j09 j09VarA = androidx.compose.ui.platform.b.a(ynb.d0(0.0f, 0.0f, 0.0f, 24.0f, 7, mh3.d0(b.c, mh3.T(l46Var), false, 14)), "friendCouponAvailable");
            uc0 uc0Var = new uc0(16.0f, true, new qc0(i3));
            jx0 jx0Var = ndb.Y;
            c92 c92VarA = a92.a(uc0Var, jx0Var, l46Var, 6);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarA);
            lf2.q.getClass();
            l46Var.j0();
            boolean z2 = l46Var.S;
            ov7 ov7Var2 = LayoutNode.h1;
            if (z2) {
                l46Var.l(ov7Var2);
            } else {
                l46Var.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var, numValueOf);
            dec.k(l46Var);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var, j09VarJ);
            g09 g09Var = g09.a;
            j09 j09VarA0 = ynb.a0(g09Var, 48.0f, 16.0f);
            c92 c92VarA2 = a92.a(new uc0(16.0f, true, new qc0(i3)), ndb.Z, l46Var, 54);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarA0);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var2);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, c92VarA2);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            dj6.p(l06Var, b.c(g09Var, 1.0f), l46Var, 48 | (i2 & 14));
            int i4 = l06Var.c;
            String strR = afc.r(R.string.friend_coupon_remaining, new Object[]{Integer.valueOf(i4), Integer.valueOf(l06Var.d)}, l46Var);
            String strValueOf = String.valueOf(i4);
            int iO = v4e.O(strR, tec.l(strValueOf, "/"), 0, false, 6);
            l46Var.f0(299662215);
            i00 i00Var = new i00();
            if (iO < 0) {
                l46Var.f0(1331570038);
                l46Var.r(false);
                i00Var.f(strR);
            } else {
                l46Var.f0(1331630023);
                i00Var.f(v4e.m0(iO, strR));
                int iK = i00Var.k(new xtd(((e8b) l46Var.k(l8b.a)).u, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                try {
                    i00Var.f(strValueOf);
                    i00Var.h(iK);
                    i00Var.f(v4e.H(strValueOf.length() + iO, strR));
                    l46Var.r(false);
                } catch (Throwable th) {
                    i00Var.h(iK);
                    throw th;
                }
            }
            k00 k00VarL = i00Var.l();
            l46Var.r(false);
            mue mueVar = pue.a;
            mue mueVarG = pue.g(l46Var);
            pr4 pr4Var = l8b.a;
            nte.c(k00VarL, null, ((e8b) l46Var.k(pr4Var)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, mueVarG, l46Var, 0, 0, 262138);
            l46Var.r(true);
            j09 j09VarB0 = ynb.b0(16.0f, 0.0f, g09Var, 2);
            int i5 = 0;
            c92 c92VarA3 = a92.a(new uc0(32.0f, true, new qc0(i5)), jx0Var, l46Var, 6);
            int iHashCode3 = Long.hashCode(l46Var.T);
            u8a u8aVarM3 = l46Var.m();
            j09 j09VarJ3 = m93.J(l46Var, j09VarB0);
            l46Var.j0();
            if (l46Var.S) {
                ov7Var = ov7Var2;
                l46Var.l(ov7Var);
            } else {
                ov7Var = ov7Var2;
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, c92VarA3);
            dec.l(he2Var2, l46Var, u8aVarM3);
            ib8.s(iHashCode3, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ3);
            j09 j09VarC = b.c(g09Var, 1.0f);
            c92 c92VarA4 = a92.a(new uc0(12.0f, true, new qc0(i5)), jx0Var, l46Var, 6);
            int iHashCode4 = Long.hashCode(l46Var.T);
            u8a u8aVarM4 = l46Var.m();
            j09 j09VarJ4 = m93.J(l46Var, j09VarC);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, c92VarA4);
            dec.l(he2Var2, l46Var, u8aVarM4);
            ib8.s(iHashCode4, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ4);
            ov7 ov7Var3 = ov7Var;
            nte.b(afc.q(R.string.friend_coupon_link_title, l46Var), ynb.b0(24.0f, 0.0f, g09Var, 2), ((e8b) l46Var.k(pr4Var)).t, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.f(l46Var), l46Var, 48, 0, 131064);
            p(l06Var.b, x16Var, l46Var, i2 & 112);
            c8b.i(b.d(b.c(g09Var, 1.0f), 56.0f), afc.q(R.string.friend_coupon_share_cta, l46Var), null, null, 0L, 0.0f, false, null, null, false, null, abg.d, x16Var2, l46Var, 6, (i2 & 896) | 48, 2044);
            l46Var2 = l46Var;
            l46Var2.r(true);
            j09 j09VarC2 = b.c(g09Var, 1.0f);
            c92 c92VarA5 = a92.a(new uc0(12.0f, true, new qc0(0)), jx0Var, l46Var2, 6);
            int iHashCode5 = Long.hashCode(l46Var2.T);
            u8a u8aVarM5 = l46Var2.m();
            j09 j09VarJ5 = m93.J(l46Var2, j09VarC2);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var3);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, c92VarA5);
            dec.l(he2Var2, l46Var2, u8aVarM5);
            ib8.s(iHashCode5, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ5);
            s(l06Var.f, 0, l46Var2);
            o(0, l46Var2);
            l46Var2.r(true);
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new m65(i, l06Var, x16Var, x16Var2, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v1, types: [l46] */
    /* JADX WARN: Type inference failed for: r14v4, types: [l46] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v19 */
    public static final void k(final s16 s16Var, x16 x16Var, x16 x16Var2, a26 a26Var, a26 a26Var2, j09 j09Var, l46 l46Var, int i) {
        int i2;
        final a26 a26Var3;
        final a26 a26Var4;
        ?? r14;
        ov7 ov7Var;
        he2 he2Var;
        he2 he2Var2;
        he2 he2Var3;
        he2 he2Var4;
        final ?? r2;
        x16 x16Var3 = x16Var2;
        l46 l46Var2 = l46Var;
        s16Var.getClass();
        x16Var.getClass();
        x16Var3.getClass();
        a26Var.getClass();
        a26Var2.getClass();
        l46Var2.h0(2084845676);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var2.g(s16Var) : l46Var2.i(s16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var2.i(x16Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var2.i(x16Var3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var2.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var2.i(a26Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var2.g(j09Var) ? 131072 : 65536;
        }
        if (l46Var2.W(i2 & 1, (74899 & i2) != 74898)) {
            FillElement fillElement = b.c;
            j09 j09VarD = j09Var.D(fillElement);
            pr4 pr4Var = l8b.a;
            j09 j09VarO = tm7.o(j09VarD, ((e8b) l46Var2.k(pr4Var)).a, g21.f);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarO);
            lf2.q.getClass();
            l46Var.j0();
            boolean z2 = l46Var.S;
            ov7 ov7Var2 = LayoutNode.h1;
            if (z2) {
                l46Var.l(ov7Var2);
            } else {
                l46Var.s0();
            }
            he2 he2Var5 = hj6.z;
            dec.l(he2Var5, l46Var, xn8VarC);
            he2 he2Var6 = hj6.y;
            dec.l(he2Var6, l46Var, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var7 = hj6.X;
            dec.l(he2Var7, l46Var, numValueOf);
            dec.k(l46Var);
            he2 he2Var8 = hj6.x;
            dec.l(he2Var8, l46Var, j09VarJ);
            if (k8b.e((e8b) l46Var.k(pr4Var))) {
                l46Var.f0(-733104061);
                he2Var4 = he2Var6;
                ov7Var = ov7Var2;
                he2Var = he2Var8;
                he2Var2 = he2Var7;
                he2Var3 = he2Var5;
                r2 = 0;
                feg.j(od4.A(R.drawable.friend_coupon_page_bg, 0, l46Var), null, fillElement, null, an2.a, 0.0f, null, l46Var, 25016, 104);
                l46Var.r(false);
            } else {
                ov7Var = ov7Var2;
                he2Var = he2Var8;
                he2Var2 = he2Var7;
                he2Var3 = he2Var5;
                he2Var4 = he2Var6;
                r2 = 0;
                l46Var.f0(-732895524);
                l46Var.r(false);
            }
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, r2);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, fillElement);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var3, l46Var, c92VarA);
            dec.l(he2Var4, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var2, l46Var);
            dec.l(he2Var, l46Var, j09VarJ2);
            pa7.a(null, y72.j, 0L, null, abg.b, null, false, false, x16Var, l46Var, ((i2 << 21) & 234881024) | 24624, 237);
            ?? r15 = l46Var;
            if (s16Var.equals(r16.a)) {
                r15.f0(1534431429);
                q(r2, r15);
                r15.r(r2);
                x16Var3 = x16Var2;
            } else {
                if (s16Var.equals(q16.a)) {
                    r15.f0(1534433332);
                    x16Var3 = x16Var2;
                    m(x16Var3, r15, (i2 >> 6) & 14);
                    r15.r(r2);
                } else {
                    x16Var3 = x16Var2;
                    if (s16Var instanceof o16) {
                        r15.f0(1534436044);
                        l06 l06Var = ((o16) s16Var).a;
                        int i3 = i2;
                        int i4 = i3 & 14;
                        int i5 = ((i4 == 4 || ((i3 & 8) != 0 && r15.i(s16Var))) ? 1 : r2) | ((i3 & 7168) == 2048 ? 1 : r2);
                        Object objR = r15.R();
                        Object obj = sf2.a;
                        if (i5 != 0 || objR == obj) {
                            a26Var3 = a26Var;
                            objR = new x16() { // from class: rz5
                                @Override // defpackage.x16
                                public final Object invoke() {
                                    int i6 = r2;
                                    wef wefVar = wef.a;
                                    s16 s16Var2 = s16Var;
                                    a26 a26Var5 = a26Var3;
                                    switch (i6) {
                                        case 0:
                                            a26Var5.d(((o16) s16Var2).a);
                                            break;
                                        default:
                                            a26Var5.d(((o16) s16Var2).a);
                                            break;
                                    }
                                    return wefVar;
                                }
                            };
                            r15.p0(objR);
                        } else {
                            a26Var3 = a26Var;
                        }
                        x16 x16Var4 = (x16) objR;
                        int i6 = ((i4 == 4 || ((i3 & 8) != 0 && r15.i(s16Var))) ? 1 : r2) | ((57344 & i3) == 16384 ? 1 : r2);
                        Object objR2 = r15.R();
                        if (i6 != 0 || objR2 == obj) {
                            a26Var4 = a26Var2;
                            final int i7 = 1;
                            objR2 = new x16() { // from class: rz5
                                @Override // defpackage.x16
                                public final Object invoke() {
                                    int i8 = i7;
                                    wef wefVar = wef.a;
                                    s16 s16Var2 = s16Var;
                                    a26 a26Var5 = a26Var4;
                                    switch (i8) {
                                        case 0:
                                            a26Var5.d(((o16) s16Var2).a);
                                            break;
                                        default:
                                            a26Var5.d(((o16) s16Var2).a);
                                            break;
                                    }
                                    return wefVar;
                                }
                            };
                            r15.p0(objR2);
                        } else {
                            a26Var4 = a26Var2;
                        }
                        j(l06Var, x16Var4, (x16) objR2, r15, r2);
                        r15.r(r2);
                    } else {
                        a26Var3 = a26Var;
                        a26Var4 = a26Var2;
                        if (!(s16Var instanceof p16)) {
                            throw tec.d(1534430102, r15, r2);
                        }
                        r15.f0(1534442215);
                        l(r2, r15);
                        r15.r(r2);
                    }
                }
                r15.r(true);
                r15.r(true);
                r14 = r15;
            }
            a26Var3 = a26Var;
            a26Var4 = a26Var2;
            r15.r(true);
            r15.r(true);
            r14 = r15;
        } else {
            a26Var3 = a26Var;
            a26Var4 = a26Var2;
            l46Var2.Z();
            r14 = l46Var2;
        }
        ojb ojbVarV = r14.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r20(s16Var, x16Var, x16Var3, a26Var3, a26Var4, j09Var, i);
        }
    }

    public static final void l(int i, l46 l46Var) {
        l46Var.h0(461062001);
        int i2 = 0;
        if (l46Var.W(i & 1, i != 0)) {
            j09 j09VarA = androidx.compose.ui.platform.b.a(ynb.a0(mh3.d0(b.c, mh3.T(l46Var), false, 14), 16.0f, 24.0f), "friendCouponEmpty");
            c92 c92VarA = a92.a(new uc0(24.0f, true, new qc0(i2)), ndb.Z, l46Var, 54);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarA);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            mh3.d(ynb.d0(0.0f, 48.0f, 0.0f, 0.0f, 13, g09.a), l46Var, 6);
            o(0, l46Var);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new sz5(i, 2);
        }
    }

    public static final void m(x16 x16Var, l46 l46Var, int i) {
        int i2;
        x16 x16Var2 = x16Var;
        l46 l46Var2 = l46Var;
        l46Var2.h0(785725753);
        if ((i & 6) == 0) {
            i2 = i | (l46Var2.i(x16Var2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (l46Var2.W(i2 & 1, (i2 & 3) != 2)) {
            j09 j09VarA = androidx.compose.ui.platform.b.a(ynb.b0(32.0f, 0.0f, b.c, 2), "friendCouponError");
            c92 c92VarA = a92.a(xc0.e, ndb.Z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarA);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, c92VarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            String strQ = afc.q(R.string.friend_coupon_error_title, l46Var2);
            mue mueVar = pue.a;
            mue mueVarN = pue.n(l46Var2);
            pr4 pr4Var = l8b.a;
            nte.b(strQ, null, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarN, l46Var, 0, 0, 130042);
            g09 g09Var = g09.a;
            nte.b(ks0.h(8.0f, R.string.friend_coupon_error_subtitle, l46Var, l46Var, g09Var), null, ((e8b) l46Var.k(pr4Var)).s, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var), l46Var, 0, 0, 130042);
            l46Var2 = l46Var;
            o5c.f(l46Var2, b.d(g09Var, 16.0f));
            x16Var2 = x16Var;
            cgg.m(x16Var2, null, false, null, null, null, abg.c, l46Var2, (i2 & 14) | 805306368, 510);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new lk3(i, 4, x16Var2);
        }
    }

    public static final void n(String str, String str2, l46 l46Var, int i) {
        String str3;
        l46 l46Var2 = l46Var;
        l46Var2.h0(408684435);
        int i2 = i | (l46Var2.g(str) ? 4 : 2) | (l46Var2.g(str2) ? 32 : 16);
        int i3 = 0;
        if (l46Var2.W(i2 & 1, (i2 & 19) != 18)) {
            j09 j09VarB0 = ynb.b0(0.0f, 18.0f, b.c(g09.a, 1.0f), 1);
            t7c t7cVarA = s7c.a(new uc0(12.0f, true, new qc0(i3)), ndb.z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarB0);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, t7cVarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            mue mueVar = pue.a;
            mue mueVarC = pue.c(l46Var2);
            pr4 pr4Var = l8b.a;
            nte.b(str, null, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarC, l46Var, i2 & 14, 0, 131066);
            o5c.f(l46Var, new jw7(1.0f, true));
            str3 = str2;
            nte.b(str3, null, ((e8b) l46Var.k(pr4Var)).s, 0L, null, null, 0L, null, new jme(6), 0L, 0, false, 0, 0, null, pue.e(l46Var), l46Var, (i2 >> 3) & 14, 0, 130042);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            str3 = str2;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new uz5(str, i, str3, 0);
        }
    }

    public static final void o(int i, l46 l46Var) {
        l46 l46Var2;
        l46Var.h0(1243890878);
        int i2 = 0;
        if (l46Var.W(i & 1, i != 0)) {
            l46Var2 = l46Var;
            t(new bx9(24.0f, 24.0f, 24.0f, 8.0f), 8.0f, abg.e, l46Var2, 438, 0);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new sz5(i, i2);
        }
    }

    public static final void p(String str, x16 x16Var, l46 l46Var, int i) {
        long jI;
        l46Var.h0(-54609430);
        int i2 = (l46Var.g(str) ? 4 : 2) | i | (l46Var.i(x16Var) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            boolean zE = k8b.e((e8b) l46Var.k(l8b.a));
            j09 j09VarC = b.c(g09.a, 1.0f);
            y6c y6cVarB = a7c.b(zE ? 32.0f : 8.0f);
            if (zE) {
                l46Var.f0(-940045091);
                jI = y72.b(l8b.g(l46Var), 0.48f);
            } else {
                l46Var.f0(-940044073);
                jI = l8b.i(l46Var);
            }
            l46Var.r(false);
            nae.a(j09VarC, y6cVarB, jI, 0L, 0.0f, 0.0f, x57.b(l8b.g(l46Var), 0.5f), af1.b0(576599919, new mb(str, x16Var, 5), l46Var), l46Var, 12582918, 56);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new mb(str, x16Var, i, 6);
        }
    }

    public static final void q(int i, l46 l46Var) {
        l46 l46Var2;
        l46Var.h0(-409597903);
        int i2 = 1;
        if (l46Var.W(i & 1, i != 0)) {
            j09 j09VarA = androidx.compose.ui.platform.b.a(b.c, "friendCouponLoading");
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarA);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            l46Var2 = l46Var;
            axa.a(0.0f, 0.0f, 0, 0, 63, 0L, 0L, l46Var2, null);
            l46Var2.r(true);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new sz5(i, i2);
        }
    }

    public static final void r(String str, l46 l46Var, int i) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(-276287584);
        int i2 = i | (l46Var2.g(str) ? 4 : 2);
        int i3 = 0;
        if (l46Var2.W(i2 & 1, (i2 & 3) != 2)) {
            g09 g09Var = g09.a;
            j09 j09VarC = b.c(g09Var, 1.0f);
            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(i3)), ndb.y, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarC);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, t7cVarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            j09 j09VarL = b.l(ynb.d0(0.0f, 6.0f, 0.0f, 0.0f, 13, g09Var), 8.0f);
            pr4 pr4Var = l8b.a;
            s21.a(tm7.o(j09VarL, ((e8b) l46Var2.k(pr4Var)).u, a7c.a), l46Var2, 0);
            mue mueVar = pue.a;
            nte.b(str, new jw7(1.0f, true), ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.e(l46Var2), l46Var, i2 & 14, 0, 131064);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o8(str, i, 16);
        }
    }

    public static final void s(int i, int i2, l46 l46Var) {
        l46 l46Var2;
        l46Var.h0(-2065247297);
        int i3 = 4;
        int i4 = (l46Var.e(i) ? 4 : 2) | i2;
        if (l46Var.W(i4 & 1, (i4 & 3) != 2)) {
            l46Var2 = l46Var;
            t(null, 0.0f, af1.b0(1716205947, new os1(i, i3), l46Var), l46Var2, 384, 3);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new os1(i, i2, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:44:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    public static final void t(xw9 xw9Var, float f2, dd2 dd2Var, l46 l46Var, int i, int i2) {
        xw9 xw9Var2;
        int i3;
        float f3;
        boolean z2;
        xw9 xw9Var3;
        float f4;
        ojb ojbVarV;
        xw9 bx9Var;
        float f5;
        boolean zE;
        float f6;
        long jI;
        l46Var.h0(1247164772);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            xw9Var2 = xw9Var;
        } else if ((i & 6) == 0) {
            xw9Var2 = xw9Var;
            i3 = i | (l46Var.g(xw9Var2) ? 4 : 2);
        } else {
            xw9Var2 = xw9Var;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                f3 = f2;
                i3 |= l46Var.d(f3) ? 32 : 16;
            }
            if ((i3 & 147) != 146) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i3 & 1, z2)) {
                if (i4 != 0) {
                    bx9Var = new bx9(24.0f, 24.0f, 24.0f, 24.0f);
                } else {
                    bx9Var = xw9Var2;
                }
                if (i5 != 0) {
                    f5 = 12.0f;
                } else {
                    f5 = f3;
                }
                zE = k8b.e((e8b) l46Var.k(l8b.a));
                j09 j09VarC = b.c(g09.a, 1.0f);
                if (zE) {
                    f6 = 32.0f;
                } else {
                    f6 = 8.0f;
                }
                y6c y6cVarB = a7c.b(f6);
                if (zE) {
                    l46Var.f0(229482423);
                    jI = y72.b(l8b.g(l46Var), 0.48f);
                } else {
                    l46Var.f0(229483441);
                    jI = l8b.i(l46Var);
                }
                l46Var.r(false);
                nae.a(j09VarC, y6cVarB, jI, 0L, 0.0f, 0.0f, x57.b(l8b.g(l46Var), 0.5f), af1.b0(-1513307543, new fz4(bx9Var, f5, dd2Var), l46Var), l46Var, 12582918, 56);
                xw9Var3 = bx9Var;
                f4 = f5;
            } else {
                l46Var.Z();
                xw9Var3 = xw9Var2;
                f4 = f3;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new tz5(xw9Var3, f4, dd2Var, i, i2, 0);
            }
        }
        i3 |= 48;
        f3 = f2;
        if ((i3 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (l46Var.W(i3 & 1, z2)) {
            if (i4 != 0) {
                bx9Var = new bx9(24.0f, 24.0f, 24.0f, 24.0f);
            } else {
                bx9Var = xw9Var2;
            }
            if (i5 != 0) {
                f5 = 12.0f;
            } else {
                f5 = f3;
            }
            zE = k8b.e((e8b) l46Var.k(l8b.a));
            j09 j09VarC2 = b.c(g09.a, 1.0f);
            if (zE) {
                f6 = 32.0f;
            } else {
                f6 = 8.0f;
            }
            y6c y6cVarB2 = a7c.b(f6);
            if (zE) {
                l46Var.f0(229482423);
                jI = y72.b(l8b.g(l46Var), 0.48f);
            } else {
                l46Var.f0(229483441);
                jI = l8b.i(l46Var);
            }
            l46Var.r(false);
            nae.a(j09VarC2, y6cVarB2, jI, 0L, 0.0f, 0.0f, x57.b(l8b.g(l46Var), 0.5f), af1.b0(-1513307543, new fz4(bx9Var, f5, dd2Var), l46Var), l46Var, 12582918, 56);
            xw9Var3 = bx9Var;
            f4 = f5;
        } else {
            l46Var.Z();
            xw9Var3 = xw9Var2;
            f4 = f3;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new tz5(xw9Var3, f4, dd2Var, i, i2, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:103:0x0303  */
    /* JADX WARN: Code duplicated, block: B:109:0x0382  */
    /* JADX WARN: Code duplicated, block: B:111:0x0392  */
    /* JADX WARN: Code duplicated, block: B:113:0x0398  */
    /* JADX WARN: Code duplicated, block: B:116:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:67:0x0153  */
    /* JADX WARN: Code duplicated, block: B:68:0x0159  */
    /* JADX WARN: Code duplicated, block: B:74:0x0182  */
    /* JADX WARN: Code duplicated, block: B:77:0x01dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01df  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x0204  */
    /* JADX WARN: Code duplicated, block: B:91:0x0276  */
    /* JADX WARN: Code duplicated, block: B:95:0x028f A[LOOP:0: B:93:0x0289->B:95:0x028f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x02b2 A[LOOP:1: B:97:0x02ac->B:99:0x02b2, LOOP_END] */
    public static final void u(j09 j09Var, zb4 zb4Var, x16 x16Var, l46 l46Var, int i, int i2) {
        j09 j09VarG;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        ojb ojbVarV;
        int i7;
        g09 g09Var;
        j09 j09Var2;
        long jC;
        boolean z3;
        boolean z4;
        boolean z5;
        tta ttaVar;
        String strC;
        boolean z6;
        boolean z7;
        boolean z8;
        Object objR;
        int i8;
        int i9;
        int iOrdinal;
        boolean z9;
        boolean z10;
        TarotSkinIdentify tarotSkinIdentify;
        TarotSkinIdentify tarotSkinIdentify2;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        Iterator it2;
        l46 l46Var2 = l46Var;
        tdb tdbVar = zb4Var.d;
        x16Var.getClass();
        l46Var2.h0(-1634355841);
        if ((i2 & 1) == 0) {
            j09VarG = j09Var;
            if (l46Var2.g(j09VarG)) {
                i3 = 4;
            }
            int i10 = i | i3;
            if (l46Var2.i(zb4Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            int i11 = i10 | i4;
            if (l46Var2.i(x16Var)) {
                i5 = 256;
            } else {
                i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i6 = i11 | i5;
            if ((i6 & 147) != 146) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var2.W(i6 & 1, z2)) {
                l46Var2.b0();
                i7 = i & 1;
                g09Var = g09.a;
                if (i7 == 0 && !l46Var2.C()) {
                    l46Var2.Z();
                    if ((i2 & 1) != 0) {
                        i6 &= -15;
                    }
                } else if ((i2 & 1) != 0) {
                    j09VarG = k8b.g(g09Var, new ie2(17), l46Var2, 6);
                    i6 &= -15;
                }
                j09Var2 = j09VarG;
                l46Var2.s();
                w57 w57VarC = zb4Var.c();
                w57VarC.getClass();
                jC = z57.a.a().c(w57VarC);
                qfc qfcVar = ar4.b;
                if (ar4.c(jC, y41.T(24, gr4.HOURS)) >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (tdbVar == tdb.a) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (tdbVar == tdb.c) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                ttaVar = cn1.Q0;
                if (ttaVar != null) {
                    pa7.g0("prettyTime");
                    throw null;
                }
                w57 w57VarC2 = zb4Var.c();
                w57VarC2.getClass();
                Instant instantOfEpochMilli = Instant.ofEpochMilli(w57VarC2.e());
                instantOfEpochMilli.getClass();
                strC = ttaVar.c(ttaVar.b(Date.from(instantOfEpochMilli)));
                if ((i6 & 112) != 32 || l46Var2.i(zb4Var)) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean zH = z6 | l46Var2.h(z3);
                if ((i6 & 896) == 256) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z7 | zH;
                objR = l46Var2.R();
                i8 = 3;
                if (z8 || objR == sf2.a) {
                    objR = new va4(i8, x16Var, zb4Var, z3);
                    l46Var2.p0(objR);
                }
                j09 j09VarA0 = ynb.a0(androidx.compose.foundation.b.c(j09Var2, false, null, null, (x16) objR, 15), 24.0f, 20.0f);
                c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
                int iHashCode = Long.hashCode(l46Var2.T);
                u8a u8aVarM = l46Var2.m();
                j09 j09VarJ = m93.J(l46Var2, j09VarA0);
                lf2.q.getClass();
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(LayoutNode.h1);
                } else {
                    l46Var2.s0();
                }
                dec.l(hj6.z, l46Var2, c92VarA);
                dec.l(hj6.y, l46Var2, u8aVarM);
                dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                dec.k(l46Var2);
                dec.l(hj6.x, l46Var2, j09VarJ);
                String str = zb4Var.b;
                if (!z4 || z5) {
                    i9 = 3;
                } else {
                    i9 = 1;
                }
                mue mueVar = pue.a;
                boolean z11 = z3;
                nte.b(str, null, 0L, 0L, ar5.d, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, null, 0L, 2, false, i9, 0, null, pue.p(l46Var2), l46Var, 1572864, 384, 110398);
                iOrdinal = tdbVar.ordinal();
                if (iOrdinal != 0) {
                    z9 = false;
                    strC = tec.i(l46Var, -465547249, R.string.text_had_read, l46Var, false);
                } else if (iOrdinal != 1) {
                    z9 = false;
                    l46Var.f0(-465545135);
                    l46Var.r(false);
                } else {
                    if (iOrdinal == 2) {
                        throw tec.d(-465548863, l46Var, false);
                    }
                    z9 = false;
                    strC = tec.i(l46Var, -465543880, R.string.quick_draw_no_question, l46Var, false);
                }
                String str2 = strC;
                str2.getClass();
                mue mueVarG = pue.g(l46Var);
                pr4 pr4Var = l8b.a;
                z10 = z9;
                nte.b(str2, null, ((e8b) l46Var.k(pr4Var)).t, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarG, l46Var, 0, 0, 131066);
                l46Var2 = l46Var;
                mfc mfcVar = ((e8b) l46Var2.k(pr4Var)).C;
                tarotSkinIdentify = zb4Var.k;
                if (tarotSkinIdentify == null && r8c.j(tarotSkinIdentify, mfcVar)) {
                    tarotSkinIdentify2 = tarotSkinIdentify;
                } else {
                    tarotSkinIdentify2 = null;
                }
                List list = zb4Var.g;
                arrayList = new ArrayList(t72.u(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(q7c.r((TarotCardChoice) it.next()));
                }
                List list2 = zb4Var.h;
                arrayList2 = new ArrayList(t72.u(list2, 10));
                it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(q7c.r((TarotCardChoice) it2.next()));
                }
                fu9.a(arrayList, arrayList2, tarotSkinIdentify2, zb4Var.l, l46Var2, 0);
                if (z5) {
                    l46Var2.f0(-1546235687);
                    l46Var2.r(z10);
                } else {
                    l46Var2.f0(-1546415580);
                    String str3 = zb4Var.c;
                    mue mueVar2 = pue.a;
                    nte.b(str3, null, 0L, 0L, null, null, 0L, null, null, w6c.l(24), 2, false, 3, 0, null, pue.e(l46Var2), l46Var, 0, 25008, 108542);
                    l46Var2 = l46Var;
                    l46Var2.r(z10);
                }
                if (tdbVar == tdb.b || z11) {
                    l46Var2.f0(-1545807143);
                    l46Var2.r(z10);
                } else {
                    l46Var2.f0(-1546152328);
                    j09 j09VarD0 = ynb.d0(0.0f, 4.0f, 0.0f, 0.0f, 13, g09Var);
                    pr4 pr4Var2 = l8b.a;
                    j09 j09VarA1 = ynb.a0(db6.w(j09VarD0, 1.0f, ((e8b) l46Var2.k(pr4Var2)).s, eze.a(l46Var2).a.a), 16.0f, 2.0f);
                    String strQ = afc.q(R.string.back_to_chat, l46Var2);
                    mue mueVar3 = pue.a;
                    nte.b(strQ, j09VarA1, ((e8b) l46Var2.k(pr4Var2)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.i(l46Var2), l46Var, 0, 0, 131064);
                    l46Var2 = l46Var;
                    l46Var2.r(z10);
                }
                l46Var2.r(true);
                j09VarG = j09Var2;
            } else {
                l46Var2.Z();
            }
            ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new b8(j09VarG, zb4Var, x16Var, i, i2);
            }
        }
        j09VarG = j09Var;
        i3 = 2;
        int i12 = i | i3;
        if (l46Var2.i(zb4Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i13 = i12 | i4;
        if (l46Var2.i(x16Var)) {
            i5 = 256;
        } else {
            i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        i6 = i13 | i5;
        if ((i6 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (l46Var2.W(i6 & 1, z2)) {
            l46Var2.b0();
            i7 = i & 1;
            g09Var = g09.a;
            if (i7 == 0) {
                if ((i2 & 1) != 0) {
                    j09VarG = k8b.g(g09Var, new ie2(17), l46Var2, 6);
                    i6 &= -15;
                }
            } else if ((i2 & 1) != 0) {
                j09VarG = k8b.g(g09Var, new ie2(17), l46Var2, 6);
                i6 &= -15;
            }
            j09Var2 = j09VarG;
            l46Var2.s();
            w57 w57VarC3 = zb4Var.c();
            w57VarC3.getClass();
            jC = z57.a.a().c(w57VarC3);
            qfc qfcVar2 = ar4.b;
            if (ar4.c(jC, y41.T(24, gr4.HOURS)) >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tdbVar == tdb.a) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (tdbVar == tdb.c) {
                z5 = true;
            } else {
                z5 = false;
            }
            ttaVar = cn1.Q0;
            if (ttaVar != null) {
                pa7.g0("prettyTime");
                throw null;
            }
            w57 w57VarC4 = zb4Var.c();
            w57VarC4.getClass();
            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(w57VarC4.e());
            instantOfEpochMilli2.getClass();
            strC = ttaVar.c(ttaVar.b(Date.from(instantOfEpochMilli2)));
            if ((i6 & 112) != 32) {
                z6 = true;
            } else {
                z6 = true;
            }
            boolean zH2 = z6 | l46Var2.h(z3);
            if ((i6 & 896) == 256) {
                z7 = true;
            } else {
                z7 = false;
            }
            z8 = z7 | zH2;
            objR = l46Var2.R();
            i8 = 3;
            if (z8) {
                objR = new va4(i8, x16Var, zb4Var, z3);
                l46Var2.p0(objR);
            } else {
                objR = new va4(i8, x16Var, zb4Var, z3);
                l46Var2.p0(objR);
            }
            j09 j09VarA2 = ynb.a0(androidx.compose.foundation.b.c(j09Var2, false, null, null, (x16) objR, 15), 24.0f, 20.0f);
            c92 c92VarA2 = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarA2);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, c92VarA2);
            dec.l(hj6.y, l46Var2, u8aVarM2);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode2));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ2);
            String str4 = zb4Var.b;
            if (z4) {
                i9 = 3;
            } else {
                i9 = 3;
            }
            mue mueVar4 = pue.a;
            boolean z12 = z3;
            nte.b(str4, null, 0L, 0L, ar5.d, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, null, 0L, 2, false, i9, 0, null, pue.p(l46Var2), l46Var, 1572864, 384, 110398);
            iOrdinal = tdbVar.ordinal();
            if (iOrdinal != 0) {
                z9 = false;
                strC = tec.i(l46Var, -465547249, R.string.text_had_read, l46Var, false);
            } else if (iOrdinal != 1) {
                z9 = false;
                l46Var.f0(-465545135);
                l46Var.r(false);
            } else {
                if (iOrdinal == 2) {
                    throw tec.d(-465548863, l46Var, false);
                }
                z9 = false;
                strC = tec.i(l46Var, -465543880, R.string.quick_draw_no_question, l46Var, false);
            }
            String str5 = strC;
            str5.getClass();
            mue mueVarG2 = pue.g(l46Var);
            pr4 pr4Var3 = l8b.a;
            z10 = z9;
            nte.b(str5, null, ((e8b) l46Var.k(pr4Var3)).t, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarG2, l46Var, 0, 0, 131066);
            l46Var2 = l46Var;
            mfc mfcVar2 = ((e8b) l46Var2.k(pr4Var3)).C;
            tarotSkinIdentify = zb4Var.k;
            if (tarotSkinIdentify == null) {
                tarotSkinIdentify2 = null;
            } else {
                tarotSkinIdentify2 = null;
            }
            List list3 = zb4Var.g;
            arrayList = new ArrayList(t72.u(list3, 10));
            it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(q7c.r((TarotCardChoice) it.next()));
            }
            List list4 = zb4Var.h;
            arrayList2 = new ArrayList(t72.u(list4, 10));
            it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(q7c.r((TarotCardChoice) it2.next()));
            }
            fu9.a(arrayList, arrayList2, tarotSkinIdentify2, zb4Var.l, l46Var2, 0);
            if (z5) {
                l46Var2.f0(-1546415580);
                String str6 = zb4Var.c;
                mue mueVar5 = pue.a;
                nte.b(str6, null, 0L, 0L, null, null, 0L, null, null, w6c.l(24), 2, false, 3, 0, null, pue.e(l46Var2), l46Var, 0, 25008, 108542);
                l46Var2 = l46Var;
                l46Var2.r(z10);
            } else {
                l46Var2.f0(-1546235687);
                l46Var2.r(z10);
            }
            if (tdbVar == tdb.b) {
                l46Var2.f0(-1545807143);
                l46Var2.r(z10);
            } else {
                l46Var2.f0(-1545807143);
                l46Var2.r(z10);
            }
            l46Var2.r(true);
            j09VarG = j09Var2;
        } else {
            l46Var2.Z();
        }
        ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b8(j09VarG, zb4Var, x16Var, i, i2);
        }
    }

    public static final void v(dd2 dd2Var, l46 l46Var, int i) {
        l46Var.h0(441837433);
        if (l46Var.W(i & 1, (i & 3) != 2)) {
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new tg8();
                l46Var.p0(objR);
            }
            tg8 tg8Var = (tg8) objR;
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = new ov7(28);
                l46Var.p0(objR2);
            }
            x16 x16Var = (x16) objR2;
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(x16Var);
            } else {
                l46Var.s0();
            }
            nd8 nd8Var = new nd8(4);
            if (l46Var.S) {
                l46Var.b(new z8d(13, nd8Var), wef.a);
            }
            dec.l(new sz5(27), l46Var, tg8Var);
            dd2Var.m(tg8Var, l46Var, 48);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qx1(dd2Var, i, 8);
        }
    }

    public static j09 w(j09 j09Var, fxd fxdVar, int i) {
        if ((i & 1) != 0) {
            hkb hkbVar = qyf.a;
            fxdVar = b21.P(0.0f, 400.0f, 1, new e77(4294967297L));
        }
        return oa7.F(j09Var).D(new bld(fxdVar));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object x(ghc ghcVar, float f2, fxd fxdVar, zn2 zn2Var) {
        ugc ugcVar;
        jmb jmbVar;
        if (zn2Var instanceof ugc) {
            ugcVar = (ugc) zn2Var;
            int i = ugcVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ugcVar.label = i - Integer.MIN_VALUE;
            } else {
                ugcVar = new ugc(zn2Var);
            }
        } else {
            ugcVar = new ugc(zn2Var);
        }
        Object obj = ugcVar.result;
        int i2 = ugcVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            jmb jmbVar2 = new jmb();
            l26 vgcVar = new vgc(f2, fxdVar, jmbVar2, null);
            ugcVar.L$0 = jmbVar2;
            ugcVar.label = 1;
            Object objB = ghcVar.b(s89.a, vgcVar, ugcVar);
            Object obj2 = bw2.a;
            if (objB == obj2) {
                return obj2;
            }
            jmbVar = jmbVar2;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jmbVar = (jmb) ugcVar.L$0;
            jzb.q(obj);
        }
        return new Float(jmbVar.element);
    }

    public static final String y(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static final void z(wg7 wg7Var, xn7 xn7Var, xn7 xn7Var2, String str) {
        nyc nycVarE = xn7Var2.e();
        nycVarE.getClass();
        wg7Var.getClass();
        pi7.d(wg7Var, nycVarE);
        if (hkg.Y(nycVarE).contains(str)) {
            String strA = xn7Var.e().a();
            String strA2 = xn7Var2.e().a();
            throw new th7(ks0.l(ib8.o("Class '", strA2, "' cannot be serialized ", (wg7Var.a.i == i22.b && pa7.t(strA, strA2)) ? "in ALL_JSON_OBJECTS class discriminator mode" : ks0.g('\'', "as base class '", strA), " because it has property name that conflicts with JSON class discriminator '"), str, "'."), strA2, "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
        }
    }
}
