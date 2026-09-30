package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fa2 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fwc b;
    public final /* synthetic */ dd2 c;

    public /* synthetic */ fa2(dd2 dd2Var, fwc fwcVar) {
        this.a = 2;
        this.c = dd2Var;
        this.b = fwcVar;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0176  */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        uuc uucVar;
        x59 x59VarG;
        int i;
        uuc uucVar2;
        x59 x59VarG2;
        boolean z;
        int i2 = this.a;
        wef wefVar = wef.a;
        fwc fwcVar = this.b;
        dd2 dd2Var = this.c;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                urg.b(fwcVar, dd2Var, (l46) obj, k99.P(49));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ynb.d(fwcVar, dd2Var, (l46) obj, k99.P(49));
                break;
            default:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i3 = 1;
                int i4 = 0;
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    dd2Var.z(l46Var, 0);
                    if (fwcVar.k() && ((Boolean) fwcVar.w.getValue()).booleanValue()) {
                        vuc vucVarJ = fwcVar.j();
                        if (!(vucVarJ == null ? true : pa7.t(vucVarJ.a, vucVarJ.b))) {
                            l46Var.f0(1202520707);
                            vuc vucVarJ2 = fwcVar.j();
                            if (vucVarJ2 == null) {
                                l46Var.f0(-1376563746);
                                l46Var.r(false);
                                z = false;
                            } else {
                                l46Var.f0(-1376563745);
                                l46Var.f0(1202522235);
                                List listI = t72.I(Boolean.TRUE, Boolean.FALSE);
                                int size = listI.size();
                                int i5 = 0;
                                while (i5 < size) {
                                    boolean zBooleanValue = ((Boolean) listI.get(i5)).booleanValue();
                                    boolean zH = l46Var.h(zBooleanValue);
                                    Object objR = l46Var.R();
                                    Object obj3 = sf2.a;
                                    if (zH || objR == obj3) {
                                        objR = new cwc(zBooleanValue, fwcVar);
                                        l46Var.p0(objR);
                                    }
                                    qne qneVar = (qne) objR;
                                    boolean zH2 = l46Var.h(zBooleanValue);
                                    Object objR2 = l46Var.R();
                                    if (zH2 || objR2 == obj3) {
                                        objR2 = zBooleanValue ? new yuc(fwcVar, i4) : new yuc(fwcVar, i3);
                                        l46Var.p0(objR2);
                                    }
                                    x16 x16Var = (x16) objR2;
                                    txb txbVar = zBooleanValue ? vucVarJ2.a.a : vucVarJ2.b.a;
                                    float fG = 0.0f;
                                    if (zBooleanValue) {
                                        vuc vucVarJ3 = fwcVar.j();
                                        if (vucVarJ3 != null && (x59VarG2 = fwcVar.g((uucVar2 = vucVarJ3.a))) != null) {
                                            int i6 = uucVar2.b;
                                            ste steVar = (ste) x59VarG2.c.invoke();
                                            if (steVar != null) {
                                                fG = mxb.g(steVar, i6);
                                            }
                                        }
                                    } else {
                                        vuc vucVarJ4 = fwcVar.j();
                                        if (vucVarJ4 != null && (x59VarG = fwcVar.g((uucVar = vucVarJ4.b))) != null) {
                                            int i7 = uucVar.b;
                                            ste steVar2 = (ste) x59VarG.c.invoke();
                                            if (steVar2 != null) {
                                                fG = mxb.g(steVar2, i7);
                                            }
                                        }
                                    }
                                    int i8 = i5;
                                    fvc fvcVar = new fvc(x16Var);
                                    boolean z2 = vucVarJ2.c;
                                    boolean zI = l46Var.i(qneVar);
                                    Object objR3 = l46Var.R();
                                    if (zI || objR3 == obj3) {
                                        i = 0;
                                        objR3 = new evc(qneVar, 0);
                                        l46Var.p0(objR3);
                                    } else {
                                        i = 0;
                                    }
                                    i7h.h(fvcVar, zBooleanValue, txbVar, z2, 0L, fG, ibe.a(g09.a, qneVar, (PointerInputEventHandler) objR3), l46Var, 0, 16);
                                    i5 = i8 + 1;
                                    i4 = i;
                                    i3 = 1;
                                    vucVarJ2 = vucVarJ2;
                                }
                                boolean z3 = i4;
                                l46Var.r(z3);
                                l46Var.r(z3);
                                z = z3;
                            }
                            l46Var.r(z);
                        } else {
                            l46Var.f0(-1374590254);
                            l46Var.r(false);
                        }
                    } else {
                        l46Var.f0(-1374590254);
                        l46Var.r(false);
                    }
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ fa2(fwc fwcVar, dd2 dd2Var, int i, int i2) {
        this.a = i2;
        this.b = fwcVar;
        this.c = dd2Var;
    }
}
