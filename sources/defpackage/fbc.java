package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.nio.ByteBuffer;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fbc {
    public static final void a(dd2 dd2Var, l46 l46Var, int i) {
        l46Var.h0(-1162635549);
        if (l46Var.W(i & 1, (i & 3) != 2)) {
            mh3.a(pwc.a.a(null), dd2Var, l46Var, 56);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qx1(dd2Var, i, 26);
        }
    }

    public static final void b(j09 j09Var, final qwc qwcVar, dd2 dd2Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(-1922770793);
        int i3 = 2;
        int i4 = 4;
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i5 = 16;
        if ((i & 48) == 0) {
            i2 |= l46Var.i(qwcVar) ? 32 : 16;
        }
        int i6 = i2 | 384;
        if ((i & 3072) == 0) {
            i6 |= l46Var.i(dd2Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        final int i7 = 0;
        if (l46Var.W(i6 & 1, (i6 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = new gpc(8);
                l46Var.p0(objR);
            }
            owc owcVar = (owc) vfh.J(objArr, owc.l, (x16) objR, l46Var, 384);
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = new fwc(owcVar);
                l46Var.p0(objR2);
            }
            final fwc fwcVar = (fwc) objR2;
            l46Var.f0(714821931);
            l46Var.r(false);
            Object obj2 = (c52) l46Var.k(zg2.f);
            Object objR3 = l46Var.R();
            if (objR3 == obj) {
                objR3 = af1.E(l46Var);
                l46Var.p0(objR3);
            }
            aw2 aw2Var = (aw2) objR3;
            fwcVar.e = (eh6) l46Var.k(zg2.l);
            boolean zG = l46Var.g(aw2Var) | l46Var.g(obj2);
            Object objR4 = l46Var.R();
            if (zG || objR4 == obj) {
                objR4 = new h6b(i5, aw2Var, obj2);
                l46Var.p0(objR4);
            }
            fwcVar.f = (a26) objR4;
            fwcVar.p(qwcVar.a());
            boolean zI = l46Var.i(qwcVar) | l46Var.i(fwcVar);
            Object objR5 = l46Var.R();
            if (zI || objR5 == obj) {
                objR5 = new a26() { // from class: avc
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v3, types: [pu4] */
                    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // defpackage.a26
                    public final Object d(Object obj3) {
                        Object arrayList;
                        int iNextIndex;
                        int i8 = i7;
                        fwc fwcVar2 = fwcVar;
                        qwc qwcVar2 = qwcVar;
                        switch (i8) {
                            case 0:
                                qwcVar2.a.setValue((vuc) obj3);
                                owc owcVar2 = fwcVar2.a;
                                if (fwcVar2.j() == null || owcVar2.a().e == 0) {
                                    arrayList = pu4.a;
                                } else {
                                    arrayList = new ArrayList();
                                    ArrayList arrayListE = owcVar2.e(fwcVar2.n());
                                    ListIterator listIterator = arrayListE.listIterator(arrayListE.size());
                                    while (true) {
                                        if (listIterator.hasPrevious()) {
                                            vuc vucVar = (vuc) owcVar2.a().e(((x59) listIterator.previous()).a);
                                            if (vucVar != null && vucVar.a.b != vucVar.b.b) {
                                                iNextIndex = listIterator.nextIndex();
                                            }
                                        } else {
                                            iNextIndex = -1;
                                        }
                                    }
                                    if (iNextIndex != -1) {
                                        int size = arrayListE.size();
                                        for (int i9 = 0; i9 < size; i9++) {
                                            x59 x59Var = (x59) arrayListE.get(i9);
                                            vuc vucVar2 = (vuc) owcVar2.a().e(x59Var.a);
                                            if (vucVar2 != null) {
                                                k00 k00VarE = x59Var.e();
                                                long jB = u3c.b(vucVar2.a.b, vucVar2.b.b);
                                                arrayList.add(k00VarE.subSequence(eue.g(jB), eue.f(jB)));
                                            }
                                        }
                                    }
                                }
                                qwcVar2.c.setValue(arrayList);
                                return wef.a;
                            default:
                                fwc fwcVar3 = qwcVar2.b;
                                if (fwcVar3 != null && fwcVar3 != fwcVar2) {
                                    qc0.p("A SelectionState can only be bound to one SelectionContainer. Please use rememberSelectionState() to create a unique state for each container.");
                                    return null;
                                }
                                if (fwcVar3 == null || fwcVar3 == fwcVar2) {
                                    qwcVar2.b = fwcVar2;
                                    return new oe0(29, qwcVar2, fwcVar2);
                                }
                                qc0.p("A SelectionState can only be bound to one SelectionContainer. Please use rememberSelectionState() to create a unique state for each container.");
                                return null;
                        }
                    }
                };
                l46Var.p0(objR5);
            }
            fwcVar.d = new h6b(17, fwcVar, (a26) objR5);
            l46Var.f0(715702021);
            fwcVar.J0 = zfa.b(tuc.b, null, l46Var, 54);
            l46Var.r(false);
            fwcVar.I0 = aw2Var;
            fwcVar.l();
            u42 u42Var = new u42(i4, fwcVar, new yuc(fwcVar, i3));
            j09 j09VarU = g09.a;
            wef wefVar = wef.a;
            j09 j09VarD = i7h.G(ibe.a(nk8.v(ok8.u(nk8.w(ibe.a(j09VarU, wefVar, u42Var), new cvc(fwcVar, i4)), fwcVar.v), new cvc(fwcVar, 5)).D(no5.a), 8675309, new sr(3, new cvc(fwcVar, 6))), new ymb(i4, fwcVar)).D(ibe.a(j09VarU, wefVar, new sr(i4, fwcVar)));
            if (fwcVar.i() != null && fwcVar.k()) {
                vuc vucVarJ = fwcVar.j();
                if (!(vucVarJ == null ? true : pa7.t(vucVarJ.a, vucVarJ.b)) && pj8.a()) {
                    j09VarU = m93.u(j09VarU, new g20(29, fwcVar));
                }
            }
            z8c.a(j09Var.D(jgb.F(j09VarD.D(j09VarU), new wf8(23, fwcVar))), af1.b0(464404577, new bvc(fwcVar, owcVar, dd2Var), l46Var), l46Var, 48);
            boolean zI2 = l46Var.i(qwcVar) | l46Var.i(fwcVar);
            Object objR6 = l46Var.R();
            if (zI2 || objR6 == obj) {
                final int i8 = 1;
                objR6 = new a26() { // from class: avc
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v3, types: [pu4] */
                    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // defpackage.a26
                    public final Object d(Object obj3) {
                        Object arrayList;
                        int iNextIndex;
                        int i9 = i8;
                        fwc fwcVar2 = fwcVar;
                        qwc qwcVar2 = qwcVar;
                        switch (i9) {
                            case 0:
                                qwcVar2.a.setValue((vuc) obj3);
                                owc owcVar2 = fwcVar2.a;
                                if (fwcVar2.j() == null || owcVar2.a().e == 0) {
                                    arrayList = pu4.a;
                                } else {
                                    arrayList = new ArrayList();
                                    ArrayList arrayListE = owcVar2.e(fwcVar2.n());
                                    ListIterator listIterator = arrayListE.listIterator(arrayListE.size());
                                    while (true) {
                                        if (listIterator.hasPrevious()) {
                                            vuc vucVar = (vuc) owcVar2.a().e(((x59) listIterator.previous()).a);
                                            if (vucVar != null && vucVar.a.b != vucVar.b.b) {
                                                iNextIndex = listIterator.nextIndex();
                                            }
                                        } else {
                                            iNextIndex = -1;
                                        }
                                    }
                                    if (iNextIndex != -1) {
                                        int size = arrayListE.size();
                                        for (int i10 = 0; i10 < size; i10++) {
                                            x59 x59Var = (x59) arrayListE.get(i10);
                                            vuc vucVar2 = (vuc) owcVar2.a().e(x59Var.a);
                                            if (vucVar2 != null) {
                                                k00 k00VarE = x59Var.e();
                                                long jB = u3c.b(vucVar2.a.b, vucVar2.b.b);
                                                arrayList.add(k00VarE.subSequence(eue.g(jB), eue.f(jB)));
                                            }
                                        }
                                    }
                                }
                                qwcVar2.c.setValue(arrayList);
                                return wef.a;
                            default:
                                fwc fwcVar3 = qwcVar2.b;
                                if (fwcVar3 != null && fwcVar3 != fwcVar2) {
                                    qc0.p("A SelectionState can only be bound to one SelectionContainer. Please use rememberSelectionState() to create a unique state for each container.");
                                    return null;
                                }
                                if (fwcVar3 == null || fwcVar3 == fwcVar2) {
                                    qwcVar2.b = fwcVar2;
                                    return new oe0(29, qwcVar2, fwcVar2);
                                }
                                qc0.p("A SelectionState can only be bound to one SelectionContainer. Please use rememberSelectionState() to create a unique state for each container.");
                                return null;
                        }
                    }
                };
                l46Var.p0(objR6);
            }
            af1.h(qwcVar, fwcVar, (a26) objR6, l46Var);
            boolean zI3 = l46Var.i(fwcVar);
            Object objR7 = l46Var.R();
            if (zI3 || objR7 == obj) {
                objR7 = new cvc(fwcVar, 0);
                l46Var.p0(objR7);
            }
            af1.g(fwcVar, (a26) objR7, l46Var);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new zuc(j09Var, qwcVar, dd2Var, i);
        }
    }

    public static final void c(qwc qwcVar, j09 j09Var, dd2 dd2Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(-1613007072);
        if ((i & 6) == 0) {
            i2 = (l46Var.i(qwcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(j09Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(dd2Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            int i3 = (i2 >> 3) & 14;
            int i4 = i2 << 3;
            b(j09Var, qwcVar, dd2Var, l46Var, (i4 & 7168) | i3 | (i4 & 112));
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new zuc(qwcVar, j09Var, dd2Var, i);
        }
    }

    public static cye d() {
        boolean zIsFixedOffset;
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        zoneIdSystemDefault.getClass();
        if (zoneIdSystemDefault instanceof ZoneOffset) {
            xpf xpfVar = new xpf((ZoneOffset) zoneIdSystemDefault);
            return new th5(xpfVar, xpfVar.b());
        }
        try {
            zIsFixedOffset = zoneIdSystemDefault.getRules().isFixedOffset();
        } catch (ArrayIndexOutOfBoundsException unused) {
            zIsFixedOffset = false;
        }
        if (!zIsFixedOffset) {
            return new cye(zoneIdSystemDefault);
        }
        ZoneId zoneIdNormalized = zoneIdSystemDefault.normalized();
        zoneIdNormalized.getClass();
        new xpf((ZoneOffset) zoneIdNormalized);
        return new th5(zoneIdSystemDefault);
    }

    public static final tag h(lbg lbgVar) {
        lbgVar.getClass();
        return new tag(lbgVar.a, lbgVar.t);
    }

    public static boolean i(Context context, int i) {
        if (l(i, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                vc6 vc6VarA = vc6.a(context);
                if (packageInfo != null) {
                    if (!vc6.c(packageInfo, false)) {
                        if (vc6.c(packageInfo, true)) {
                            if (!sc6.a(vc6VarA.a)) {
                                b1.l("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                                return false;
                            }
                        }
                    }
                    return true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static final tt7 k(c8f c8fVar) {
        c8fVar.getClass();
        bm3 bm3VarK = c8fVar.k();
        bm3VarK.getClass();
        boolean z = bm3VarK instanceof z22;
        int i = 0;
        dsf dsfVar = dsf.OUT_VARIANCE;
        if (z) {
            List parameters = ((z22) bm3VarK).h().getParameters();
            parameters.getClass();
            ArrayList arrayList = new ArrayList(t72.u(parameters, 10));
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                arrayList.add(((c8f) it.next()).h());
            }
            List upperBounds = c8fVar.getUpperBounds();
            upperBounds.getClass();
            xr7 xr7VarE = qz3.e(c8fVar);
            tt7 tt7VarH = new q8f(new ezd(i, arrayList)).h((tt7) s72.v0(upperBounds), dsfVar);
            return tt7VarH == null ? xr7VarE.n() : tt7VarH;
        }
        if (!(bm3VarK instanceof c36)) {
            qc0.j("Unsupported descriptor type to build star projection type based on type parameters of it");
            return null;
        }
        List typeParameters = ((c36) bm3VarK).getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList2 = new ArrayList(t72.u(typeParameters, 10));
        Iterator it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((c8f) it2.next()).h());
        }
        List upperBounds2 = c8fVar.getUpperBounds();
        upperBounds2.getClass();
        xr7 xr7VarE2 = qz3.e(c8fVar);
        tt7 tt7VarH2 = new q8f(new ezd(i, arrayList2)).h((tt7) s72.v0(upperBounds2), dsfVar);
        return tt7VarH2 == null ? xr7VarE2.n() : tt7VarH2;
    }

    public static boolean l(int i, Context context, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) rcg.a(context).a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static final ewf m(em7 em7Var, pwf pwfVar, d37 d37Var, gy2 gy2Var, l46 l46Var) {
        jwf jwfVarJ = d37Var;
        if (d37Var == null) {
            jwfVarJ = hcc.j(pwfVar);
        }
        jwfVarJ.getClass();
        gy2Var.getClass();
        owf owfVarG = pwfVar.g();
        owfVarG.getClass();
        kxa kxaVar = new kxa(owfVarG, jwfVarJ, gy2Var);
        em7Var.getClass();
        String strG = em7Var.g();
        if (strG != null) {
            return kxaVar.f(em7Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strG));
        }
        qc0.j("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static int n(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public su8 e(zu8 zu8Var) {
        ByteBuffer byteBuffer = zu8Var.e;
        byteBuffer.getClass();
        pa7.A(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return f(zu8Var, byteBuffer);
    }

    public abstract su8 f(zu8 zu8Var, ByteBuffer byteBuffer);

    public boolean g(sac sacVar) {
        return true;
    }

    public abstract void j(String str);
}
