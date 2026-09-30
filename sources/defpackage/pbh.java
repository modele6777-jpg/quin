package defpackage;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pbh implements b1h {
    public final /* synthetic */ int a;
    public final Serializable b;
    public final Object c;
    public final Object d;

    public pbh() {
        this.a = 0;
        this.b = new AtomicBoolean(false);
        new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0063 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0067 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x006b A[Catch: all -> 0x0023, PHI: r12
  0x006b: PHI (r12v3 int) = (r12v1 int), (r12v0 int) binds: [B:14:0x0030, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
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
    @Override // defpackage.b1h
    public void a(String str, int i, Throwable th, byte[] bArr, Map map) {
        g1h g1hVar;
        krg krgVar;
        String strSubstring;
        Object obj;
        int i2 = this.a;
        Serializable serializable = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i2) {
            case 1:
                ((ich) obj2).w(true, i, th, bArr, (String) serializable, (ArrayList) obj3, map);
                return;
            default:
                long j = ((kch) obj3).a;
                ich ichVar = (ich) obj2;
                String str2 = (String) serializable;
                ichVar.Z().A0();
                ichVar.m0();
                if (bArr == null) {
                    try {
                        bArr = new byte[0];
                    } finally {
                        ichVar.J0 = false;
                        ichVar.M();
                    }
                }
                if (i == 200) {
                    if (th == null) {
                        krg krgVar2 = ichVar.c;
                        ich.S(krgVar2);
                        krgVar2.H0(Long.valueOf(j));
                        ichVar.v().Z.c(str2, Integer.valueOf(i), "Successfully uploaded batch from upload queue. appId, status");
                        g1hVar = ichVar.b;
                        ich.S(g1hVar);
                        if (g1hVar.E0()) {
                            krgVar = ichVar.c;
                            ich.S(krgVar);
                            if (krgVar.G0(str2)) {
                                ichVar.o(str2);
                            } else {
                                ichVar.L();
                            }
                        } else {
                            ichVar.L();
                        }
                    } else {
                        String str3 = new String(bArr, StandardCharsets.UTF_8);
                        strSubstring = str3.substring(0, Math.min(32, str3.length()));
                        tz0 tz0Var = ichVar.v().z;
                        Integer numValueOf = Integer.valueOf(i);
                        obj = th;
                        if (th == null) {
                            obj = strSubstring;
                        }
                        tz0Var.d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf, obj);
                        krg krgVar3 = ichVar.c;
                        ich.S(krgVar3);
                        krgVar3.M0(Long.valueOf(j));
                        ichVar.L();
                    }
                } else if (i == 204) {
                    i = 204;
                    if (th == null) {
                        krg krgVar4 = ichVar.c;
                        ich.S(krgVar4);
                        krgVar4.H0(Long.valueOf(j));
                        ichVar.v().Z.c(str2, Integer.valueOf(i), "Successfully uploaded batch from upload queue. appId, status");
                        g1hVar = ichVar.b;
                        ich.S(g1hVar);
                        if (g1hVar.E0()) {
                            krgVar = ichVar.c;
                            ich.S(krgVar);
                            if (krgVar.G0(str2)) {
                                ichVar.o(str2);
                            } else {
                                ichVar.L();
                            }
                        } else {
                            ichVar.L();
                        }
                    } else {
                        String str4 = new String(bArr, StandardCharsets.UTF_8);
                        strSubstring = str4.substring(0, Math.min(32, str4.length()));
                        tz0 tz0Var2 = ichVar.v().z;
                        Integer numValueOf2 = Integer.valueOf(i);
                        obj = th;
                        if (th == null) {
                            obj = strSubstring;
                        }
                        tz0Var2.d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf2, obj);
                        krg krgVar5 = ichVar.c;
                        ich.S(krgVar5);
                        krgVar5.M0(Long.valueOf(j));
                        ichVar.L();
                    }
                } else {
                    String str5 = new String(bArr, StandardCharsets.UTF_8);
                    strSubstring = str5.substring(0, Math.min(32, str5.length()));
                    tz0 tz0Var3 = ichVar.v().z;
                    Integer numValueOf3 = Integer.valueOf(i);
                    obj = th;
                    if (th == null) {
                        obj = strSubstring;
                    }
                    tz0Var3.d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf3, obj);
                    krg krgVar6 = ichVar.c;
                    ich.S(krgVar6);
                    krgVar6.M0(Long.valueOf(j));
                    ichVar.L();
                }
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:57:0x004f A[EDGE_INSN: B:57:0x004f->B:55:0x004f BREAK  A[LOOP:1: B:25:0x0071->B:60:?], SYNTHETIC] */
    public void b(xlg xlgVar, Set set, String str) {
        nbh[] nbhVarArr;
        if (!set.isEmpty() && !((AtomicBoolean) this.b).getAndSet(true)) {
            if (ssg.c == null) {
                synchronized (ssg.class) {
                    try {
                        if (ssg.c == null) {
                            ssg.c = new ssg(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            ((CopyOnWriteArrayList) ssg.c.b).add(0, new jwg(21));
        }
        final byte[] bArrN = xlgVar.n();
        ((ConcurrentHashMap) this.c).compute(str, new BiFunction() { // from class: lbh
            @Override // java.util.function.BiFunction
            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                byte[] bArr = (byte[]) obj2;
                byte[] bArr2 = bArrN;
                return Arrays.equals(bArr, bArr2) ? bArr : bArr2;
            }
        });
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AtomicReference atomicReference = (AtomicReference) ((ConcurrentHashMap) this.d).putIfAbsent((String) it.next(), new AtomicReference(new nbh(str, bArrN)));
            if (atomicReference != null) {
                while (true) {
                    Object obj = atomicReference.get();
                    if (obj instanceof nbh) {
                        nbh nbhVar = (nbh) obj;
                        if (str.equals(nbhVar.a)) {
                            nbhVar.a(bArrN);
                            break;
                        }
                        nbh nbhVar2 = new nbh(str, bArrN);
                        nbhVarArr = str.compareTo(nbhVar.a) < 0 ? new nbh[]{nbhVar2, nbhVar} : new nbh[]{nbhVar, nbhVar2};
                        do {
                            if (atomicReference.compareAndSet(obj, nbhVarArr)) {
                                break;
                            }
                        } while (atomicReference.get() == obj);
                    } else {
                        nbh[] nbhVarArr2 = (nbh[]) obj;
                        int iBinarySearch = Arrays.binarySearch(nbhVarArr2, str);
                        if (iBinarySearch >= 0) {
                            nbhVarArr2[iBinarySearch].a(bArrN);
                            break;
                        }
                        int i = ~iBinarySearch;
                        int length = nbhVarArr2.length;
                        int i2 = length + 1;
                        int i3 = length - i;
                        if (i3 == 0) {
                            nbhVarArr = (nbh[]) Arrays.copyOf(nbhVarArr2, i2);
                        } else {
                            nbh[] nbhVarArr3 = new nbh[i2];
                            System.arraycopy(nbhVarArr2, 0, nbhVarArr3, 0, i);
                            System.arraycopy(nbhVarArr2, i, nbhVarArr3, i + 1, i3);
                            nbhVarArr = nbhVarArr3;
                        }
                        nbhVarArr[i] = new nbh(str, bArrN);
                        do {
                            if (atomicReference.compareAndSet(obj, nbhVarArr)) {
                                break;
                                break;
                            }
                        } while (atomicReference.get() == obj);
                    }
                }
            }
        }
    }

    public /* synthetic */ pbh(ich ichVar, String str, Object obj, int i) {
        this.a = i;
        this.b = str;
        this.c = obj;
        this.d = ichVar;
    }
}
