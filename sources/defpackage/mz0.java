package defpackage;

import android.graphics.Bitmap;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class mz0 implements a26 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public mz0(l0 l0Var, pl1 pl1Var, Bitmap bitmap) {
        this.a = 0;
        nz0 nz0Var = nz0.a;
        this.b = l0Var;
        this.c = pl1Var;
        this.d = bitmap;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "map";
        } else if (i == 2) {
            objArr[0] = "compute";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 3) {
            objArr[1] = "recursionDetected";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i != 3 && i != 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.a26
    public Object d(Object obj) {
        ta0 ta0Var;
        long j;
        int i = this.a;
        AssertionError assertionErrorF = null;
        Object obj2 = null;
        int i2 = 3;
        wef wefVar = wef.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                Bitmap bitmap = (Bitmap) obj5;
                pl1 pl1Var = (pl1) obj4;
                nz0 nz0Var = nz0.a;
                if (((Boolean) ((l0) obj3).d(Integer.valueOf(iIntValue))).booleanValue()) {
                    pl1Var.n(bitmap, new a7(i2));
                } else {
                    nz0Var.d(bitmap);
                    pl1Var.n(null, new a7(i2));
                }
                return wefVar;
            case 1:
                i4f i4fVar = (i4f) obj;
                lj4 lj4Var = (lj4) i4fVar;
                if (!((pr) vd0.t0((lj4) obj4).getDragAndDropManager()).b.contains(lj4Var) || !lmg.X(lj4Var, rxg.G((fj4) obj5))) {
                    return h4f.a;
                }
                ((mmb) obj3).element = i4fVar;
                return h4f.c;
            case 2:
                Locale locale = (Locale) obj;
                locale.getClass();
                Locale[] localeArr = vd8.a;
                e89 e89Var = (e89) obj5;
                if (!pa7.t(vd8.c((Locale) obj3), vd8.c((Locale) e89Var.getValue()))) {
                    ((a26) obj4).d(locale);
                    e89Var.setValue(locale);
                }
                return wefVar;
            case 3:
                ge8 ge8Var = (ge8) obj3;
                ndb ndbVar = ge8Var.b;
                mjd mjdVar = ge8Var.a;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj4;
                Object objD = concurrentHashMap.get(obj);
                Object obj6 = ncg.a;
                fe8 fe8Var = fe8.b;
                if (objD == null || objD == fe8Var) {
                    mjdVar.lock();
                    try {
                        Object obj7 = concurrentHashMap.get(obj);
                        fe8 fe8Var2 = fe8.c;
                        if (obj7 == fe8Var) {
                            pk1 pk1VarD = ge8Var.d(obj, "");
                            if (pk1VarD == null) {
                                a(3);
                                throw null;
                            }
                            if (pk1VarD.b) {
                                obj7 = fe8Var2;
                            } else {
                                obj2 = pk1VarD.c;
                            }
                            mjdVar.unlock();
                            return obj2;
                        }
                        if (obj7 == fe8Var2) {
                            pk1 pk1VarD2 = ge8Var.d(obj, "");
                            if (pk1VarD2 == null) {
                                a(3);
                                throw null;
                            }
                            if (!pk1VarD2.b) {
                                obj2 = pk1VarD2.c;
                            }
                            mjdVar.unlock();
                            return obj2;
                        }
                        if (obj7 != null) {
                            ncg.a(obj7);
                            if (obj7 != obj6) {
                                obj2 = obj7;
                            }
                            mjdVar.unlock();
                            return obj2;
                        }
                        try {
                            concurrentHashMap.put(obj, fe8Var);
                            objD = ((a26) obj5).d(obj);
                            if (objD != null) {
                                obj6 = objD;
                            }
                            Object objPut = concurrentHashMap.put(obj, obj6);
                            if (objPut != fe8Var) {
                                assertionErrorF = f(obj, objPut);
                                throw assertionErrorF;
                            }
                            mjdVar.unlock();
                        } catch (Throwable th) {
                            if (z5c.C(th)) {
                                try {
                                    Object objRemove = concurrentHashMap.remove(obj);
                                    if (objRemove != fe8Var) {
                                        throw e(obj, objRemove);
                                    }
                                    throw th;
                                } catch (Throwable th2) {
                                    throw g(obj, th2);
                                }
                            }
                            if (th != assertionErrorF) {
                                Object objPut2 = concurrentHashMap.put(obj, new mcg(th));
                                if (objPut2 != fe8Var) {
                                    throw f(obj, objPut2);
                                }
                                ndbVar.getClass();
                                throw th;
                            }
                            try {
                                concurrentHashMap.remove(obj);
                                ndbVar.getClass();
                                throw th;
                            } catch (Throwable th3) {
                                throw g(obj, th3);
                            }
                        }
                        mjdVar.unlock();
                        throw th;
                    } catch (Throwable th4) {
                        mjdVar.unlock();
                        throw th4;
                    }
                }
                ncg.a(objD);
                if (objD == obj6) {
                    return null;
                }
                return objD;
            case 4:
                sn4 sn4Var = (sn4) obj;
                d6d d6dVar = (d6d) obj5;
                int i3 = d6dVar.c;
                int i4 = d6dVar.d;
                int i5 = d6dVar.b;
                int i6 = d6dVar.a;
                c6d c6dVar = (c6d) obj4;
                qad qadVar = c6dVar.b;
                sn4Var.getClass();
                zt ztVar = (zt) obj3;
                if (ztVar == null) {
                    cv6 cv6Var = c6dVar.a;
                    sn4.g0(sn4Var, cv6Var, ((long) i6) & 4294967295L, (((long) ((ks) cv6Var).a.getWidth()) << 32) | (((long) i5) & 4294967295L), 0L, (((long) qadVar.b) << 32) | (((long) i4) & 4294967295L), 0.0f, null, 0, 992);
                    return wefVar;
                }
                ta0 ta0VarV0 = sn4Var.v0();
                long jZ = ta0VarV0.z();
                ta0VarV0.p().g();
                try {
                    vd9.J((vd9) ta0VarV0.c, 0.0f, -i3, 1);
                    ta0 ta0VarV1 = sn4Var.v0();
                    long jZ2 = ta0VarV1.z();
                    ta0VarV1.p().g();
                    try {
                        ((vd9) ta0VarV1.c).k(ztVar, 1);
                        ta0 ta0VarV2 = sn4Var.v0();
                        ta0Var = ta0VarV1;
                        try {
                            long jZ3 = ta0VarV2.z();
                            ta0VarV2.p().g();
                            try {
                                try {
                                    vd9.J((vd9) ta0VarV2.c, 0.0f, i3, 1);
                                    cv6 cv6Var2 = c6dVar.a;
                                    long j2 = ((long) i6) & 4294967295L;
                                    long width = (((long) i5) & 4294967295L) | (((long) ((ks) cv6Var2).a.getWidth()) << 32);
                                    long j3 = (((long) qadVar.b) << 32) | (((long) i4) & 4294967295L);
                                    j = jZ3;
                                    ta0VarV0 = ta0VarV0;
                                    jZ2 = jZ2;
                                    try {
                                        sn4.g0(sn4Var, cv6Var2, j2, width, 0L, j3, 0.0f, null, 0, 992);
                                        try {
                                            ta0VarV2.p().o();
                                            ta0VarV2.R(j);
                                            try {
                                                ta0Var.p().o();
                                                ta0Var.R(jZ2);
                                                ks0.t(ta0VarV0, jZ);
                                                return wefVar;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                jZ = jZ;
                                                ks0.t(ta0VarV0, jZ);
                                                throw th;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            ta0Var = ta0Var;
                                            jZ = jZ;
                                            try {
                                                ta0Var.p().o();
                                                ta0Var.R(jZ2);
                                                throw th;
                                            } catch (Throwable th7) {
                                                th = th7;
                                                ks0.t(ta0VarV0, jZ);
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        jZ = jZ;
                                        try {
                                            ta0VarV2.p().o();
                                            ta0VarV2.R(j);
                                            throw th;
                                        } catch (Throwable th9) {
                                            th = th9;
                                            ta0Var.p().o();
                                            ta0Var.R(jZ2);
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    j = jZ3;
                                    ta0VarV2.p().o();
                                    ta0VarV2.R(j);
                                    throw th;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                j = jZ3;
                            }
                        } catch (Throwable th12) {
                            th = th12;
                            ta0VarV0 = ta0VarV0;
                            jZ2 = jZ2;
                            jZ = jZ;
                            ta0Var = ta0Var;
                        }
                    } catch (Throwable th13) {
                        th = th13;
                        ta0Var = ta0VarV1;
                        ta0VarV0 = ta0VarV0;
                        jZ2 = jZ2;
                        jZ = jZ;
                    }
                } catch (Throwable th14) {
                    th = th14;
                    ta0VarV0 = ta0VarV0;
                    jZ = jZ;
                }
                break;
            default:
                cag cagVar = (cag) obj5;
                h48 h48Var = (h48) obj4;
                wg6 wg6Var = (wg6) obj3;
                nu4 nu4Var = nu4.a;
                if (wg6Var.b1(nu4Var)) {
                    wg6Var.Z0(nu4Var, new v36(21, h48Var, cagVar));
                } else {
                    h48Var.b(cagVar);
                }
                return wefVar;
        }
    }

    public AssertionError e(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Inconsistent key detected. " + fe8.b + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + ((ge8) this.b));
        ge8.e(assertionError);
        return assertionError;
    }

    public AssertionError f(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + ((ge8) this.b));
        ge8.e(assertionError);
        return assertionError;
    }

    public AssertionError g(Object obj, Throwable th) {
        AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + ((ge8) this.b), th);
        ge8.e(assertionError);
        return assertionError;
    }

    public /* synthetic */ mz0(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
