package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ux4 {
    public final pid a;
    public final String b;
    public final String c;
    public final List d;
    public final ArrayList e;
    public final List f;
    public final List g;
    public final boolean h;
    public final ok8 i;

    public ux4(pid pidVar, String str, String str2, List list, ArrayList arrayList, List list2, List list3, boolean z, ok8 ok8Var) {
        str.getClass();
        list.getClass();
        this.a = pidVar;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = arrayList;
        this.f = list2;
        this.g = list3;
        this.h = z;
        this.i = ok8Var;
        if (pidVar != pid.c || (arrayList.isEmpty() && list.isEmpty() && list2.isEmpty())) {
            if (list2.size() == list3.size()) {
                return;
            }
            StringBuilder sb = new StringBuilder("javaParameterTypesIfFunction.size (");
            sb.append(list2.size());
            sb.append(") and javaGenericParameterTypesIfFunction.size (");
            sb.append(list3.size());
            sb.append(") must be equal. For member: '");
            ho7.j(ub3.l(sb, str, '\''));
            throw null;
        }
        StringBuilder sb2 = new StringBuilder("Inconsistent combination of EquatableCallableSignature values. kind: ");
        sb2.append(pidVar);
        boolean zIsEmpty = arrayList.isEmpty();
        boolean zIsEmpty2 = list.isEmpty();
        boolean zIsEmpty3 = list2.isEmpty();
        sb2.append(", kotlinParameterTypes.isEmpty(): ");
        sb2.append(zIsEmpty);
        sb2.append(",typeParameters.isEmpty(): ");
        sb2.append(zIsEmpty2);
        sb2.append(", javaParameterTypesIfFunction.isEmpty(): ");
        sb2.append(zIsEmpty3);
        sb2.append(".For member: '");
        sb2.append(str);
        sb2.append('\'');
        throw new IllegalStateException(sb2.toString().toString());
    }

    public final boolean equals(Object obj) {
        List list;
        fo7 fo7VarG;
        int i = 1;
        if (this != obj) {
            if (obj instanceof ux4) {
                ux4 ux4Var = (ux4) obj;
                List list2 = ux4Var.d;
                List list3 = ux4Var.f;
                String str = ux4Var.b;
                ArrayList arrayList = ux4Var.e;
                ok8 ok8Var = ux4Var.i;
                ok8 ok8Var2 = this.i;
                boolean zEquals = ok8Var2.equals(ok8Var);
                String str2 = this.b;
                if (!zEquals) {
                    ho7.j(ib8.j("Equality modes must be the same for member '", str2, "'. Please recreate signatures on inheritance"));
                    return false;
                }
                pid pidVar = ux4Var.a;
                pid pidVar2 = this.a;
                if (pidVar2 == pidVar && this.h == ux4Var.h) {
                    ArrayList arrayList2 = this.e;
                    if (arrayList2.size() == arrayList.size()) {
                        if (!ok8Var2.equals(sx4.I) || pidVar2 != pid.a) {
                            if (!pa7.t(str2, str) || (fo7VarG = ia5.g((list = this.d), list2)) == null) {
                                return false;
                            }
                            int size = list.size();
                            int i2 = 0;
                            while (true) {
                                io7 io7Var = io7.a;
                                if (i2 >= size) {
                                    int size2 = arrayList2.size();
                                    for (int i3 = 0; i3 < size2; i3++) {
                                        yn7 yn7Var = (yn7) arrayList2.get(i3);
                                        fo7 fo7Var = fo7.c;
                                        yn7 yn7Var2 = fo7VarG.b(yn7Var, io7Var).b;
                                        if (yn7Var2 == null) {
                                            ia5.f(str2);
                                            throw null;
                                        }
                                        yn7 yn7Var3 = (yn7) arrayList.get(i3);
                                        if (!oa7.U(yn7Var2, yn7Var3) || !oa7.U(yn7Var3, yn7Var2)) {
                                            return false;
                                        }
                                    }
                                    break;
                                }
                                ao7 ao7Var = (ao7) list.get(i2);
                                ao7 ao7Var2 = (ao7) list2.get(i2);
                                if (ao7Var.getUpperBounds().size() != ao7Var2.getUpperBounds().size()) {
                                    return false;
                                }
                                List<yn7> upperBounds = ao7Var.getUpperBounds();
                                ArrayList arrayList3 = new ArrayList(t72.u(upperBounds, 10));
                                for (yn7 yn7Var4 : upperBounds) {
                                    fo7 fo7Var2 = fo7.c;
                                    yn7 yn7Var5 = fo7VarG.b(yn7Var4, io7Var).b;
                                    if (yn7Var5 == null) {
                                        ia5.f(str2);
                                        throw null;
                                    }
                                    arrayList3.add(yn7Var5);
                                }
                                ArrayList<iy9> arrayListR1 = s72.r1(s72.b1(arrayList3, new y85(i, str2)), s72.b1(ao7Var2.getUpperBounds(), new y85(i, str)));
                                if (!arrayListR1.isEmpty()) {
                                    for (iy9 iy9Var : arrayListR1) {
                                        yn7 yn7Var6 = (yn7) iy9Var.d();
                                        yn7 yn7Var7 = (yn7) iy9Var.e();
                                        if (!oa7.U(yn7Var6, yn7Var7) || !oa7.U(yn7Var7, yn7Var6)) {
                                            return false;
                                        }
                                    }
                                }
                                i2++;
                            }
                        } else if (pa7.t(this.c, ux4Var.c)) {
                            List list4 = this.f;
                            if (list4.size() == list3.size()) {
                                if (list4.size() != arrayList2.size()) {
                                    StringBuilder sb = new StringBuilder("javaParameterTypesIfFunction.size (");
                                    sb.append(list4.size());
                                    sb.append(") and kotlinParameterTypes.size (");
                                    sb.append(arrayList2.size());
                                    sb.append(") must be equal for member '");
                                    ho7.j(ub3.l(sb, str2, '\''));
                                    return false;
                                }
                                int size3 = list4.size();
                                for (int i4 = 0; i4 < size3; i4++) {
                                    Type type = (Type) this.g.get(i4);
                                    Class cls = (Class) list4.get(i4);
                                    Type type2 = (Type) ux4Var.g.get(i4);
                                    Class cls2 = (Class) list3.get(i4);
                                    TypeVariable typeVariable = type instanceof TypeVariable ? (TypeVariable) type : null;
                                    boolean z = (typeVariable != null ? typeVariable.getGenericDeclaration() : null) instanceof Class;
                                    TypeVariable typeVariable2 = type2 instanceof TypeVariable ? (TypeVariable) type2 : null;
                                    boolean z2 = (typeVariable2 != null ? typeVariable2.getGenericDeclaration() : null) instanceof Class;
                                    if (z || z2) {
                                        if (cls.isPrimitive() != cls2.isPrimitive()) {
                                            return false;
                                        }
                                        yn7 yn7VarA = ia5.a((yn7) arrayList2.get(i4), str2);
                                        yn7 yn7VarA2 = ia5.a((yn7) arrayList.get(i4), str);
                                        if (!oa7.U(yn7VarA, yn7VarA2) || !oa7.U(yn7VarA2, yn7VarA)) {
                                            return false;
                                        }
                                    } else if (!pa7.t(cls, cls2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean zEquals = this.i.equals(sx4.I);
        pid pidVar = this.a;
        boolean z = zEquals && pidVar == pid.a;
        boolean z2 = this.h;
        ArrayList arrayList = this.e;
        if (!z) {
            if (!z) {
                return Arrays.hashCode(new Object[]{pidVar, Integer.valueOf(arrayList.size()), Boolean.valueOf(z2), this.b});
            }
            ap.c();
            return 0;
        }
        Integer numValueOf = Integer.valueOf(arrayList.size());
        Boolean boolValueOf = Boolean.valueOf(z2);
        String str = this.c;
        if (str == null) {
            str = "";
        }
        return Arrays.hashCode(new Object[]{pidVar, numValueOf, boolValueOf, str});
    }

    public final String toString() {
        return "EquatableCallableSignature(kind=" + this.a + ", name=" + this.b + ", jvmNameIfFunction=" + this.c + ", typeParameters=" + this.d + ", kotlinParameterTypes=" + this.e + ", javaParameterTypesIfFunction=" + this.f + ", javaGenericParameterTypesIfFunction=" + this.g + ", isStatic=" + this.h + ", equalityMode=" + this.i + ')';
    }
}
