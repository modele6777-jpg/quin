package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class at6 {
    public final otb a;
    public final hm9 b;
    public final cu2 c;

    public at6(otb otbVar, hm9 hm9Var, cu2 cu2Var) {
        this.a = otbVar;
        this.b = hm9Var;
        this.c = cu2Var;
    }

    /* JADX WARN: Code duplicated, block: B:385:0x093d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:386:0x093f  */
    /* JADX WARN: Code duplicated, block: B:587:0x0959 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:0x0941 A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static at6 b(qzb qzbVar, Class cls, Method method) {
        Type genericReturnType;
        boolean z;
        boolean z2;
        Type typeB;
        n16 n16Var;
        Annotation[][] annotationArr;
        int i;
        int i2;
        int i3;
        Annotation[] annotationArr2;
        Type type;
        int i4;
        Method method2;
        n16 jz9Var;
        n16 az9Var;
        Method method3 = method;
        ntb ntbVar = new ntb(qzbVar, cls, method3);
        Annotation[] annotationArr3 = ntbVar.d;
        int length = annotationArr3.length;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String str = "HEAD";
            boolean z3 = true;
            n16 n16Var2 = null;
            if (i6 >= length) {
                if (ntbVar.o == null) {
                    throw an1.G(method3, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!ntbVar.p) {
                    if (ntbVar.r) {
                        throw an1.G(method3, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (ntbVar.q) {
                        throw an1.G(method3, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr4 = ntbVar.e;
                int length2 = annotationArr4.length;
                ntbVar.w = new n16[length2];
                int i7 = length2 - 1;
                int i8 = 0;
                while (i8 < length2) {
                    n16[] n16VarArr = ntbVar.w;
                    Type type2 = ntbVar.f[i8];
                    Annotation[] annotationArr5 = annotationArr4[i8];
                    int i9 = i8 == i7 ? 1 : i5;
                    if (annotationArr5 != null) {
                        int length3 = annotationArr5.length;
                        int i10 = i5;
                        n16Var = n16Var2;
                        while (i10 < length3) {
                            Annotation annotation = annotationArr5[i10];
                            iz9 iz9Var = iz9.J;
                            n16[] n16VarArr2 = n16VarArr;
                            int i11 = length3;
                            if (annotation instanceof rhf) {
                                ntbVar.c(i8, type2);
                                if (ntbVar.n) {
                                    throw an1.I(method3, i8, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (ntbVar.j) {
                                    throw an1.I(method3, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (ntbVar.k) {
                                    throw an1.I(method3, i8, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (ntbVar.l) {
                                    throw an1.I(method3, i8, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (ntbVar.m) {
                                    throw an1.I(method3, i8, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (ntbVar.s != null) {
                                    throw an1.I(method3, i8, "@Url cannot be used with @%s URL", ntbVar.o);
                                }
                                ntbVar.n = true;
                                if (type2 != ct6.class && type2 != String.class && type2 != URI.class && (!(type2 instanceof Class) || !"android.net.Uri".equals(((Class) type2).getName()))) {
                                    throw an1.I(method3, i8, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                jz9Var = new ez9(method3, i8, 1);
                                annotationArr = annotationArr4;
                                i2 = length2;
                                i3 = i7;
                                i = i10;
                            } else {
                                annotationArr = annotationArr4;
                                boolean z4 = annotation instanceof f1a;
                                qzb qzbVar2 = ntbVar.a;
                                if (z4) {
                                    ntbVar.c(i8, type2);
                                    if (ntbVar.k) {
                                        throw an1.I(method3, i8, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (ntbVar.l) {
                                        throw an1.I(method3, i8, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (ntbVar.m) {
                                        throw an1.I(method3, i8, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (ntbVar.n) {
                                        throw an1.I(method3, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (ntbVar.s == null) {
                                        throw an1.I(method3, i8, "@Path can only be used with relative url on @%s", ntbVar.o);
                                    }
                                    ntbVar.j = true;
                                    f1a f1aVar = (f1a) annotation;
                                    String strValue = f1aVar.value();
                                    if (!ntb.z.matcher(strValue).matches()) {
                                        throw an1.I(method3, i8, "@Path parameter name must match %s. Found: %s", ntb.y.pattern(), strValue);
                                    }
                                    if (!ntbVar.v.contains(strValue)) {
                                        throw an1.I(method3, i8, "URL \"%s\" does not contain \"{%s}\".", ntbVar.s, strValue);
                                    }
                                    int i12 = i8;
                                    i = i10;
                                    method2 = method3;
                                    str = str;
                                    i3 = i7;
                                    jz9Var = new gz9(ntbVar.c, i12, strValue, qzbVar2.e(type2, annotationArr5), f1aVar.encoded());
                                    annotationArr2 = annotationArr5;
                                    type = type2;
                                    i4 = i12;
                                    i2 = length2;
                                } else {
                                    i = i10;
                                    i2 = length2;
                                    if (annotation instanceof a4b) {
                                        ntbVar.c(i8, type2);
                                        a4b a4bVar = (a4b) annotation;
                                        String strValue2 = a4bVar.value();
                                        boolean zEncoded = a4bVar.encoded();
                                        Class clsC = an1.C(type2);
                                        i3 = i7;
                                        ntbVar.k = true;
                                        if (Iterable.class.isAssignableFrom(clsC)) {
                                            if (!(type2 instanceof ParameterizedType)) {
                                                throw an1.I(method3, i8, clsC.getSimpleName() + " must include generic type (e.g., " + clsC.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            jz9Var = new az9(new cz9(strValue2, qzbVar2.e(an1.B(0, (ParameterizedType) type2), annotationArr5), zEncoded, 2), 0);
                                        } else if (clsC.isArray()) {
                                            jz9Var = new az9(new cz9(strValue2, qzbVar2.e(ntb.a(clsC.getComponentType()), annotationArr5), zEncoded, 2), 1);
                                        } else {
                                            jz9Var = new cz9(strValue2, qzbVar2.e(type2, annotationArr5), zEncoded, 2);
                                        }
                                    } else {
                                        i3 = i7;
                                        if (annotation instanceof c4b) {
                                            ntbVar.c(i8, type2);
                                            boolean zEncoded2 = ((c4b) annotation).encoded();
                                            Class clsC2 = an1.C(type2);
                                            ntbVar.l = true;
                                            if (!Iterable.class.isAssignableFrom(clsC2)) {
                                                jz9Var = clsC2.isArray() ? new az9(new hz9(qzbVar2.e(ntb.a(clsC2.getComponentType()), annotationArr5), zEncoded2), 1) : new hz9(qzbVar2.e(type2, annotationArr5), zEncoded2);
                                            } else {
                                                if (!(type2 instanceof ParameterizedType)) {
                                                    throw an1.I(method3, i8, clsC2.getSimpleName() + " must include generic type (e.g., " + clsC2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                jz9Var = new az9(new hz9(qzbVar2.e(an1.B(0, (ParameterizedType) type2), annotationArr5), zEncoded2), 0);
                                            }
                                        } else {
                                            if (annotation instanceof b4b) {
                                                ntbVar.c(i8, type2);
                                                Class clsC3 = an1.C(type2);
                                                ntbVar.m = true;
                                                if (!Map.class.isAssignableFrom(clsC3)) {
                                                    throw an1.I(method, i8, "@QueryMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeD = an1.D(type2, clsC3);
                                                if (!(typeD instanceof ParameterizedType)) {
                                                    throw an1.I(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType = (ParameterizedType) typeD;
                                                Type typeB2 = an1.B(0, parameterizedType);
                                                if (String.class != typeB2) {
                                                    throw an1.I(method, i8, "@QueryMap keys must be of type String: " + typeB2, new Object[0]);
                                                }
                                                Type type3 = type2;
                                                Annotation[] annotationArr6 = annotationArr5;
                                                method3 = method;
                                                jz9Var = new dz9(method3, i8, qzbVar2.e(an1.B(1, parameterizedType), annotationArr5), ((b4b) annotation).encoded(), 2);
                                                i4 = i8;
                                                type = type3;
                                                str = str;
                                                annotationArr2 = annotationArr6;
                                            } else {
                                                str = str;
                                                annotationArr2 = annotationArr5;
                                                type = type2;
                                                i4 = i8;
                                                method2 = method;
                                                if (annotation instanceof ni6) {
                                                    ntbVar.c(i4, type);
                                                    ni6 ni6Var = (ni6) annotation;
                                                    String strValue3 = ni6Var.value();
                                                    Class clsC4 = an1.C(type);
                                                    if (Iterable.class.isAssignableFrom(clsC4)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw an1.I(method2, i4, clsC4.getSimpleName() + " must include generic type (e.g., " + clsC4.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        az9Var = new az9(new cz9(strValue3, qzbVar2.e(an1.B(0, (ParameterizedType) type), annotationArr2), ni6Var.allowUnsafeNonAsciiValues(), 1), 0);
                                                    } else if (clsC4.isArray()) {
                                                        az9Var = new az9(new cz9(strValue3, qzbVar2.e(ntb.a(clsC4.getComponentType()), annotationArr2), ni6Var.allowUnsafeNonAsciiValues(), 1), 1);
                                                    } else {
                                                        jz9Var = new cz9(strValue3, qzbVar2.e(type, annotationArr2), ni6Var.allowUnsafeNonAsciiValues(), 1);
                                                    }
                                                    jz9Var = az9Var;
                                                } else {
                                                    if (annotation instanceof pi6) {
                                                        if (type == si6.class) {
                                                            az9Var = new ez9(method2, i4, 0);
                                                        } else {
                                                            ntbVar.c(i4, type);
                                                            Class clsC5 = an1.C(type);
                                                            if (!Map.class.isAssignableFrom(clsC5)) {
                                                                throw an1.I(method2, i4, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                            }
                                                            Type typeD2 = an1.D(type, clsC5);
                                                            if (!(typeD2 instanceof ParameterizedType)) {
                                                                throw an1.I(method2, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                            }
                                                            ParameterizedType parameterizedType2 = (ParameterizedType) typeD2;
                                                            Type typeB3 = an1.B(0, parameterizedType2);
                                                            if (String.class != typeB3) {
                                                                throw an1.I(method2, i4, "@HeaderMap keys must be of type String: " + typeB3, new Object[0]);
                                                            }
                                                            method3 = method2;
                                                            jz9Var = new dz9(method3, i4, qzbVar2.e(an1.B(1, parameterizedType2), annotationArr2), ((pi6) annotation).allowUnsafeNonAsciiValues(), 1);
                                                            i4 = i4;
                                                            type = type;
                                                        }
                                                    } else if (annotation instanceof qc5) {
                                                        ntbVar.c(i4, type);
                                                        if (!ntbVar.q) {
                                                            throw an1.I(method2, i4, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                        }
                                                        qc5 qc5Var = (qc5) annotation;
                                                        String strValue4 = qc5Var.value();
                                                        boolean zEncoded3 = qc5Var.encoded();
                                                        ntbVar.g = true;
                                                        Class clsC6 = an1.C(type);
                                                        if (Iterable.class.isAssignableFrom(clsC6)) {
                                                            if (!(type instanceof ParameterizedType)) {
                                                                throw an1.I(method2, i4, clsC6.getSimpleName() + " must include generic type (e.g., " + clsC6.getSimpleName() + "<String>)", new Object[0]);
                                                            }
                                                            az9Var = new az9(new cz9(strValue4, qzbVar2.e(an1.B(0, (ParameterizedType) type), annotationArr2), zEncoded3, 0), 0);
                                                        } else if (clsC6.isArray()) {
                                                            az9Var = new az9(new cz9(strValue4, qzbVar2.e(ntb.a(clsC6.getComponentType()), annotationArr2), zEncoded3, 0), 1);
                                                        } else {
                                                            jz9Var = new cz9(strValue4, qzbVar2.e(type, annotationArr2), zEncoded3, 0);
                                                        }
                                                    } else if (annotation instanceof uc5) {
                                                        ntbVar.c(i4, type);
                                                        if (!ntbVar.q) {
                                                            throw an1.I(method2, i4, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                        }
                                                        Class clsC7 = an1.C(type);
                                                        if (!Map.class.isAssignableFrom(clsC7)) {
                                                            throw an1.I(method2, i4, "@FieldMap parameter type must be Map.", new Object[0]);
                                                        }
                                                        Type typeD3 = an1.D(type, clsC7);
                                                        if (!(typeD3 instanceof ParameterizedType)) {
                                                            throw an1.I(method2, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                        }
                                                        ParameterizedType parameterizedType3 = (ParameterizedType) typeD3;
                                                        Type typeB4 = an1.B(0, parameterizedType3);
                                                        if (String.class != typeB4) {
                                                            throw an1.I(method2, i4, "@FieldMap keys must be of type String: " + typeB4, new Object[0]);
                                                        }
                                                        cu2 cu2VarE = qzbVar2.e(an1.B(1, parameterizedType3), annotationArr2);
                                                        ntbVar.g = true;
                                                        jz9Var = new dz9(method2, i4, cu2VarE, ((uc5) annotation).encoded(), 0);
                                                    } else if (annotation instanceof o0a) {
                                                        ntbVar.c(i4, type);
                                                        if (!ntbVar.r) {
                                                            throw an1.I(method2, i4, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                        }
                                                        o0a o0aVar = (o0a) annotation;
                                                        ntbVar.h = true;
                                                        String strValue5 = o0aVar.value();
                                                        Class clsC8 = an1.C(type);
                                                        if (!strValue5.isEmpty()) {
                                                            String[] strArr = {"Content-Disposition", ib8.j("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", o0aVar.encoding()};
                                                            si6 si6Var = si6.b;
                                                            si6 si6VarG = y41.G(strArr);
                                                            if (Iterable.class.isAssignableFrom(clsC8)) {
                                                                if (!(type instanceof ParameterizedType)) {
                                                                    throw an1.I(method2, i4, clsC8.getSimpleName() + " must include generic type (e.g., " + clsC8.getSimpleName() + "<String>)", new Object[0]);
                                                                }
                                                                int i13 = 0;
                                                                Type typeB5 = an1.B(0, (ParameterizedType) type);
                                                                if (e69.class.isAssignableFrom(an1.C(typeB5))) {
                                                                    throw an1.I(method2, i4, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                                }
                                                                az9Var = new az9(new fz9(method2, i4, si6VarG, qzbVar2.c(typeB5, annotationArr2, annotationArr3)), i13);
                                                            } else if (clsC8.isArray()) {
                                                                Class clsA = ntb.a(clsC8.getComponentType());
                                                                if (e69.class.isAssignableFrom(clsA)) {
                                                                    throw an1.I(method2, i4, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                                }
                                                                az9Var = new az9(new fz9(method2, i4, si6VarG, qzbVar2.c(clsA, annotationArr2, annotationArr3)), 1);
                                                            } else {
                                                                if (e69.class.isAssignableFrom(clsC8)) {
                                                                    throw an1.I(method2, i4, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                                }
                                                                jz9Var = new fz9(method2, i4, si6VarG, qzbVar2.c(type, annotationArr2, annotationArr3));
                                                            }
                                                        } else if (Iterable.class.isAssignableFrom(clsC8)) {
                                                            if (!(type instanceof ParameterizedType)) {
                                                                throw an1.I(method2, i4, clsC8.getSimpleName() + " must include generic type (e.g., " + clsC8.getSimpleName() + "<String>)", new Object[0]);
                                                            }
                                                            int i14 = 0;
                                                            if (!e69.class.isAssignableFrom(an1.C(an1.B(0, (ParameterizedType) type)))) {
                                                                throw an1.I(method2, i4, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                            }
                                                            az9Var = new az9(iz9Var, i14);
                                                        } else if (clsC8.isArray()) {
                                                            if (!e69.class.isAssignableFrom(clsC8.getComponentType())) {
                                                                throw an1.I(method2, i4, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                            }
                                                            az9Var = new az9(iz9Var, 1);
                                                        } else {
                                                            if (!e69.class.isAssignableFrom(clsC8)) {
                                                                throw an1.I(method2, i4, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                            }
                                                            jz9Var = iz9Var;
                                                        }
                                                    } else if (annotation instanceof p0a) {
                                                        ntbVar.c(i4, type);
                                                        if (!ntbVar.r) {
                                                            throw an1.I(method2, i4, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                        }
                                                        ntbVar.h = true;
                                                        Class clsC9 = an1.C(type);
                                                        if (!Map.class.isAssignableFrom(clsC9)) {
                                                            throw an1.I(method2, i4, "@PartMap parameter type must be Map.", new Object[0]);
                                                        }
                                                        Type typeD4 = an1.D(type, clsC9);
                                                        if (!(typeD4 instanceof ParameterizedType)) {
                                                            throw an1.I(method2, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                        }
                                                        ParameterizedType parameterizedType4 = (ParameterizedType) typeD4;
                                                        Type typeB6 = an1.B(0, parameterizedType4);
                                                        if (String.class != typeB6) {
                                                            throw an1.I(method2, i4, "@PartMap keys must be of type String: " + typeB6, new Object[0]);
                                                        }
                                                        Type typeB7 = an1.B(1, parameterizedType4);
                                                        if (e69.class.isAssignableFrom(an1.C(typeB7))) {
                                                            throw an1.I(method2, i4, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                        }
                                                        jz9Var = new fz9(method2, i4, qzbVar2.c(typeB7, annotationArr2, annotationArr3), ((p0a) annotation).encoding());
                                                    } else if (annotation instanceof w01) {
                                                        ntbVar.c(i4, type);
                                                        if (ntbVar.q || ntbVar.r) {
                                                            throw an1.I(method2, i4, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                        }
                                                        if (ntbVar.i) {
                                                            throw an1.I(method2, i4, "Multiple @Body method annotations found.", new Object[0]);
                                                        }
                                                        try {
                                                            cu2 cu2VarC = qzbVar2.c(type, annotationArr2, annotationArr3);
                                                            ntbVar.i = true;
                                                            jz9Var = new bz9(method2, i4, cu2VarC);
                                                        } catch (RuntimeException e) {
                                                            throw an1.J(method2, e, i4, "Unable to create @Body converter for %s", type);
                                                        }
                                                    } else if (annotation instanceof vde) {
                                                        ntbVar.c(i4, type);
                                                        Class clsA2 = ntb.a(an1.C(type));
                                                        for (int i15 = i4 - 1; i15 >= 0; i15--) {
                                                            n16 n16Var3 = ntbVar.w[i15];
                                                            if ((n16Var3 instanceof jz9) && ((jz9) n16Var3).J.equals(clsA2)) {
                                                                throw an1.I(method2, i4, "@Tag type " + clsA2.getName() + " is duplicate of " + tea.b.n(method2, i15) + " and would always overwrite its value.", new Object[0]);
                                                            }
                                                        }
                                                        jz9Var = new jz9(clsA2);
                                                    } else {
                                                        jz9Var = null;
                                                    }
                                                    jz9Var = az9Var;
                                                }
                                            }
                                            method2 = method3;
                                        }
                                    }
                                }
                                if (jz9Var == null) {
                                    i4 = i4;
                                    method2 = method2;
                                    type = type;
                                } else {
                                    if (n16Var == null) {
                                        throw an1.I(method2, i4, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                    }
                                    n16Var = jz9Var;
                                }
                                i10 = i + 1;
                                method3 = method2;
                                i8 = i4;
                                type2 = type;
                                annotationArr5 = annotationArr2;
                                i7 = i3;
                                length2 = i2;
                                str = str;
                                n16VarArr = n16VarArr2;
                                length3 = i11;
                                annotationArr4 = annotationArr;
                            }
                            annotationArr2 = annotationArr5;
                            type = type2;
                            i4 = i8;
                            method2 = method3;
                            if (jz9Var == null) {
                                i4 = i4;
                                method2 = method2;
                                type = type;
                            } else {
                                if (n16Var == null) {
                                    throw an1.I(method2, i4, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                                n16Var = jz9Var;
                            }
                            i10 = i + 1;
                            method3 = method2;
                            i8 = i4;
                            type2 = type;
                            annotationArr5 = annotationArr2;
                            i7 = i3;
                            length2 = i2;
                            str = str;
                            n16VarArr = n16VarArr2;
                            length3 = i11;
                            annotationArr4 = annotationArr;
                        }
                    } else {
                        n16Var = null;
                    }
                    n16[] n16VarArr3 = n16VarArr;
                    Type type4 = type2;
                    String str2 = str;
                    Annotation[][] annotationArr7 = annotationArr4;
                    int i16 = length2;
                    int i17 = i7;
                    int i18 = i8;
                    Method method4 = method3;
                    if (n16Var == null) {
                        if (i9 != 0) {
                            try {
                                if (an1.C(type4) == xn2.class) {
                                    ntbVar.x = true;
                                    n16Var = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw an1.I(method4, i18, "No Retrofit annotation found.", new Object[0]);
                    }
                    n16VarArr3[i18] = n16Var;
                    method3 = method4;
                    i7 = i17;
                    length2 = i16;
                    str = str2;
                    annotationArr4 = annotationArr7;
                    i5 = 0;
                    n16Var2 = null;
                    i8 = i18 + 1;
                }
                Method method5 = method3;
                String str3 = str;
                if (ntbVar.s == null && !ntbVar.n) {
                    throw an1.G(method5, null, "Missing either @%s URL or @Url parameter.", ntbVar.o);
                }
                boolean z5 = ntbVar.q;
                if (!z5 && !ntbVar.r && !ntbVar.p && ntbVar.i) {
                    throw an1.G(method5, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z5 && !ntbVar.g) {
                    throw an1.G(method5, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (ntbVar.r && !ntbVar.h) {
                    throw an1.G(method5, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                otb otbVar = new otb(ntbVar);
                Type genericReturnType2 = method5.getGenericReturnType();
                if (an1.E(genericReturnType2)) {
                    throw an1.G(method5, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw an1.G(method5, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method5.getAnnotations();
                boolean z6 = otbVar.l;
                if (z6) {
                    Type[] genericParameterTypes = method5.getGenericParameterTypes();
                    Type type5 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (type5 instanceof WildcardType) {
                        type5 = ((WildcardType) type5).getLowerBounds()[0];
                    }
                    if (an1.C(type5) == qyb.class && (type5 instanceof ParameterizedType)) {
                        typeB = an1.B(0, (ParameterizedType) type5);
                        z = true;
                        z2 = false;
                    } else {
                        if (an1.C(type5) == u91.class) {
                            throw an1.G(method5, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", an1.B(0, (ParameterizedType) type5));
                        }
                        z2 = an1.N0 && type5 == wef.class;
                        typeB = type5;
                        z = false;
                    }
                    genericReturnType = new uqf(null, u91.class, typeB);
                    if (!an1.F(annotations, jod.class)) {
                        Annotation[] annotationArr8 = new Annotation[annotations.length + 1];
                        annotationArr8[0] = kod.b;
                        System.arraycopy(annotations, 0, annotationArr8, 1, annotations.length);
                        annotations = annotationArr8;
                    }
                } else {
                    genericReturnType = method5.getGenericReturnType();
                    z = false;
                    z2 = false;
                }
                try {
                    x91 x91VarA = qzbVar.a(genericReturnType, annotations);
                    Type typeK = x91VarA.k();
                    if (typeK == ryb.class) {
                        throw an1.G(method5, null, "'" + an1.C(typeK).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeK == qyb.class) {
                        throw an1.G(method5, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (otbVar.d.equals(str3) && !Void.class.equals(typeK) && (!an1.N0 || typeK != wef.class)) {
                        throw an1.G(method5, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        cu2 cu2VarD = qzbVar.d(typeK, method5.getAnnotations());
                        hm9 hm9Var = qzbVar.b;
                        if (z6) {
                            return z ? new ys6(otbVar, hm9Var, cu2VarD, x91VarA, 1) : new zs6(otbVar, hm9Var, cu2VarD, x91VarA, z2);
                        }
                        return new ys6(otbVar, hm9Var, cu2VarD, x91VarA, 0);
                    } catch (RuntimeException e2) {
                        throw an1.G(method5, e2, "Unable to create converter for %s", typeK);
                    }
                } catch (RuntimeException e3) {
                    throw an1.G(method5, e3, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr3[i6];
            if (annotation2 instanceof k23) {
                ntbVar.b("DELETE", ((k23) annotation2).value(), false);
            } else if (annotation2 instanceof y36) {
                ntbVar.b("GET", ((y36) annotation2).value(), false);
            } else if (annotation2 instanceof qg6) {
                ntbVar.b("HEAD", ((qg6) annotation2).value(), false);
            } else if (annotation2 instanceof hw9) {
                ntbVar.b("PATCH", ((hw9) annotation2).value(), true);
            } else if (annotation2 instanceof iw9) {
                ntbVar.b("POST", ((iw9) annotation2).value(), true);
            } else if (annotation2 instanceof jw9) {
                ntbVar.b("PUT", ((jw9) annotation2).value(), true);
            } else if (annotation2 instanceof kk9) {
                ntbVar.b("OPTIONS", ((kk9) annotation2).value(), false);
            } else if (annotation2 instanceof rg6) {
                rg6 rg6Var = (rg6) annotation2;
                ntbVar.b(rg6Var.method(), rg6Var.path(), rg6Var.hasBody());
            } else if (annotation2 instanceof ri6) {
                ri6 ri6Var = (ri6) annotation2;
                String[] strArrValue = ri6Var.value();
                if (strArrValue.length == 0) {
                    throw an1.G(method3, null, "@Headers annotation is empty.", new Object[0]);
                }
                boolean zAllowUnsafeNonAsciiValues = ri6Var.allowUnsafeNonAsciiValues();
                qi6 qi6Var = new qi6();
                int length4 = strArrValue.length;
                int i19 = 0;
                while (i19 < length4) {
                    String str4 = strArrValue[i19];
                    int iIndexOf = str4.indexOf(58);
                    boolean z7 = z3;
                    if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str4.length() - 1) {
                        throw an1.G(method3, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str4);
                    }
                    String strSubstring = str4.substring(0, iIndexOf);
                    String strTrim = str4.substring(iIndexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                        try {
                            rob robVar = oq8.e;
                            ntbVar.u = kj0.c0(strTrim);
                        } catch (IllegalArgumentException e4) {
                            throw an1.G(method3, e4, "Malformed content type: %s", strTrim);
                        }
                    } else if (zAllowUnsafeNonAsciiValues) {
                        strTrim.getClass();
                        xdc.p(strSubstring);
                        xdc.g(qi6Var, strSubstring, strTrim);
                    } else {
                        qi6Var.a(strSubstring, strTrim);
                    }
                    i19++;
                    z3 = z7;
                }
                ntbVar.t = xdc.h(qi6Var);
            } else if (annotation2 instanceof d69) {
                if (ntbVar.q) {
                    throw an1.G(method3, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                ntbVar.r = true;
            } else if (!(annotation2 instanceof pr5)) {
                continue;
            } else {
                if (ntbVar.r) {
                    throw an1.G(method3, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                ntbVar.q = true;
            }
            i6++;
        }
    }

    public abstract Object a(fm9 fm9Var, Object[] objArr);
}
