package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wn2 implements xn7 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public Object c;
    public final Object d;

    public wn2(em7 em7Var, xn7[] xn7VarArr) {
        em7Var.getClass();
        this.b = em7Var;
        List listAsList = Arrays.asList(xn7VarArr);
        listAsList.getClass();
        this.c = listAsList;
        nyc[] nycVarArr = new nyc[0];
        if (v4e.Q("kotlinx.serialization.ContextualSerializer")) {
            qc0.j("Blank serial names are prohibited");
            throw null;
        }
        g5e g5eVar = g5e.c;
        qyc qycVar = qyc.c;
        if (qycVar == g5eVar) {
            qc0.j("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            throw null;
        }
        q22 q22Var = new q22("kotlinx.serialization.ContextualSerializer");
        q22Var.b = pu4.a;
        this.d = new jn2(new pyc("kotlinx.serialization.ContextualSerializer", qycVar, q22Var.c.size(), qd0.G0(nycVarArr), q22Var), em7Var);
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                obj.getClass();
                em7 em7Var = (em7) obj2;
                xn7 xn7VarC = ev4Var.a().c(em7Var, (List) this.c);
                if (xn7VarC == null) {
                    throw new yyc(hkg.D0(em7Var));
                }
                ev4Var.h(xn7VarC, obj);
                return;
            case 1:
                Enum r5 = (Enum) obj;
                r5.getClass();
                Enum[] enumArr = (Enum[]) obj2;
                int iR0 = qd0.r0(enumArr, r5);
                if (iR0 != -1) {
                    ev4Var.t(e(), iR0);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(r5);
                String strA = e().a();
                String string = Arrays.toString(enumArr);
                string.getClass();
                sb.append(" is not a valid enum ");
                sb.append(strA);
                sb.append(", must be one of ");
                sb.append(string);
                throw new yyc(sb.toString());
            default:
                obj.getClass();
                ev4Var.c(e()).b(e());
                return;
        }
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                em7 em7Var = (em7) obj;
                xn7 xn7VarC = om3Var.a().c(em7Var, (List) this.c);
                if (xn7VarC != null) {
                    return om3Var.h(xn7VarC);
                }
                throw new yyc(hkg.D0(em7Var));
            case 1:
                Enum[] enumArr = (Enum[]) obj;
                int iV = om3Var.v(e());
                if (iV >= 0 && iV < enumArr.length) {
                    return enumArr[iV];
                }
                throw new yyc(iV + " is not among valid " + e().a() + " enum values, values size is " + enumArr.length);
            default:
                nyc nycVarE = e();
                zf2 zf2VarC = om3Var.c(nycVarE);
                int iJ = zf2VarC.j(e());
                if (iJ != -1) {
                    throw new yyc(tec.e(iJ, "Unexpected index "));
                }
                zf2VarC.b(nycVarE);
                return obj;
        }
    }

    @Override // defpackage.xn7
    public final nyc e() {
        switch (this.a) {
            case 0:
                return (jn2) this.d;
            case 1:
                return (nyc) ((ace) this.d).getValue();
            default:
                return (nyc) ((lw7) this.d).getValue();
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "kotlinx.serialization.internal.EnumSerializer<" + e().a() + '>';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wn2(String str, Object obj, Annotation[] annotationArr) {
        this(obj, str);
        obj.getClass();
        List listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.c = listAsList;
    }

    public wn2(Object obj, String str) {
        obj.getClass();
        this.b = obj;
        this.c = pu4.a;
        this.d = eb3.N(z18.b, new ek9(1, str, this));
    }

    public wn2(String str, Enum[] enumArr) {
        enumArr.getClass();
        this.b = enumArr;
        this.d = new ace(new jt3(15, this, str));
    }
}
