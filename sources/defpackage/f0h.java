package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0h extends fzg {
    public static final String[] f = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    public final irg d;
    public boolean e;

    public f0h(w3h w3hVar) {
        super(w3hVar);
        this.d = new irg(this, ((w3h) this.b).a);
    }

    @Override // defpackage.fzg
    public final boolean D0() {
        return false;
    }

    public final void E0() {
        int iDelete;
        w3h w3hVar = (w3h) this.b;
        A0();
        try {
            SQLiteDatabase sQLiteDatabaseG0 = G0();
            if (sQLiteDatabaseG0 == null || (iDelete = sQLiteDatabaseG0.delete("messages", null, null)) <= 0) {
                return;
            }
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.Z.b(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e) {
            w0h w0hVar2 = w3hVar.f;
            w3h.h(w0hVar2);
            w0hVar2.g.b(e, "Error resetting local analytics data. error");
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006f A[PHI: r4
  0x006f: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:32:0x0080, B:28:0x006d, B:25:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    public final void F0() {
        w3h w3hVar = (w3h) this.b;
        A0();
        if (!this.e && w3hVar.a.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseG0 = G0();
                        if (sQLiteDatabaseG0 == null) {
                            this.e = true;
                            return;
                        }
                        sQLiteDatabaseG0.beginTransaction();
                        sQLiteDatabaseG0.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        sQLiteDatabaseG0.setTransactionSuccessful();
                        sQLiteDatabaseG0.endTransaction();
                        sQLiteDatabaseG0.close();
                        return;
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i);
                        i += 20;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    } catch (SQLiteFullException e) {
                        w0h w0hVar = w3hVar.f;
                        w3h.h(w0hVar);
                        w0hVar.g.b(e, "Error deleting app launch break from local database");
                        this.e = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteException e2) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    w0h w0hVar2 = w3hVar.f;
                    w3h.h(w0hVar2);
                    w0hVar2.g.b(e2, "Error deleting app launch break from local database");
                    this.e = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            w0h w0hVar3 = w3hVar.f;
            w3h.h(w0hVar3);
            w0hVar3.x.a("Error deleting app launch break from local database in reasonable time");
        }
    }

    public final SQLiteDatabase G0() {
        if (this.e) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.d.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.e = true;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x0120 A[Catch: all -> 0x0154, TRY_ENTER, TryCatch #10 {all -> 0x0154, blocks: (B:30:0x0088, B:32:0x008e, B:43:0x00ae, B:45:0x00cf, B:47:0x00d8, B:49:0x00de, B:59:0x00f8, B:73:0x0120, B:75:0x0126, B:76:0x0129, B:93:0x015b, B:83:0x0144), top: B:109:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0139  */
    /* JADX WARN: Code duplicated, block: B:86:0x014b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0150 A[PHI: r8 r10 r17
  0x0150: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r10v7 android.database.sqlite.SQLiteDatabase) = 
  (r10v5 android.database.sqlite.SQLiteDatabase)
  (r10v6 android.database.sqlite.SQLiteDatabase)
  (r10v8 android.database.sqlite.SQLiteDatabase)
 binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x016a  */
    public final boolean H0(byte[] bArr, int i) {
        SQLiteDatabase sQLiteDatabaseG0;
        boolean z;
        boolean z2;
        Cursor cursorRawQuery;
        w3h w3hVar = (w3h) this.b;
        A0();
        boolean z3 = false;
        z3 = false;
        if (!this.e) {
            qqg qqgVar = w3hVar.d;
            w0h w0hVar = w3hVar.f;
            azg azgVar = bzg.W0;
            Cursor cursor = null;
            cursor = null;
            ndh ndhVarE0 = qqgVar.L0(null, azgVar) ? w3hVar.l().E0(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i));
            contentValues.put("entry", bArr);
            if (w3hVar.d.L0(null, azgVar) && ndhVarE0 != null) {
                contentValues.put("app_version", ndhVarE0.c);
                contentValues.put("app_version_int", Long.valueOf(ndhVarE0.x));
            }
            int i2 = 5;
            int i3 = 0;
            for (int i4 = 5; i3 < i4; i4 = 5) {
                try {
                    sQLiteDatabaseG0 = G0();
                    if (sQLiteDatabaseG0 == null) {
                        this.e = true;
                    } else {
                        try {
                            sQLiteDatabaseG0.beginTransaction();
                            cursorRawQuery = sQLiteDatabaseG0.rawQuery("select count(1) from messages", null);
                            long j = 0;
                            if (cursorRawQuery != null) {
                                try {
                                    try {
                                        if (cursorRawQuery.moveToFirst()) {
                                            j = cursorRawQuery.getLong(z3 ? 1 : 0);
                                        }
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        z = z3 ? 1 : 0;
                                        SystemClock.sleep(i2);
                                        i2 += 20;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseG0 != null) {
                                            sQLiteDatabaseG0.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    } catch (SQLiteFullException e) {
                                        e = e;
                                        z = z3 ? 1 : 0;
                                        w3h.h(w0hVar);
                                        w0hVar.g.b(e, "Error writing entry; local database full");
                                        this.e = true;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseG0 != null) {
                                            sQLiteDatabaseG0.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        z = z3 ? 1 : 0;
                                        z2 = true;
                                        if (sQLiteDatabaseG0 != null) {
                                            sQLiteDatabaseG0.endTransaction();
                                        }
                                        w3h.h(w0hVar);
                                        w0hVar.g.b(e, "Error writing entry to local database");
                                        this.e = z2;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseG0 != null) {
                                            sQLiteDatabaseG0.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    cursor = cursorRawQuery;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabaseG0 != null) {
                                        sQLiteDatabaseG0.close();
                                    }
                                    throw th;
                                }
                            }
                            if (j >= 100000) {
                                w3h.h(w0hVar);
                                w0hVar.g.a("Data loss, local db full");
                                long j2 = 100001 - j;
                                long jDelete = sQLiteDatabaseG0.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                                if (jDelete != j2) {
                                    w3h.h(w0hVar);
                                    tz0 tz0Var = w0hVar.g;
                                    z = z3 ? 1 : 0;
                                    try {
                                        try {
                                            z2 = true;
                                            try {
                                                tz0Var.d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                                            } catch (SQLiteFullException e3) {
                                                e = e3;
                                                w3h.h(w0hVar);
                                                w0hVar.g.b(e, "Error writing entry; local database full");
                                                this.e = true;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseG0 != null) {
                                                    sQLiteDatabaseG0.close();
                                                }
                                                i3++;
                                                z3 = z;
                                            } catch (SQLiteException e4) {
                                                e = e4;
                                                if (sQLiteDatabaseG0 != null) {
                                                    sQLiteDatabaseG0.endTransaction();
                                                }
                                                w3h.h(w0hVar);
                                                w0hVar.g.b(e, "Error writing entry to local database");
                                                this.e = z2;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseG0 != null) {
                                                    sQLiteDatabaseG0.close();
                                                }
                                                i3++;
                                                z3 = z;
                                            }
                                        } catch (SQLiteFullException e5) {
                                            e = e5;
                                            w3h.h(w0hVar);
                                            w0hVar.g.b(e, "Error writing entry; local database full");
                                            this.e = true;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseG0 != null) {
                                                sQLiteDatabaseG0.close();
                                            }
                                            i3++;
                                            z3 = z;
                                        } catch (SQLiteException e6) {
                                            e = e6;
                                            z2 = true;
                                            if (sQLiteDatabaseG0 != null && sQLiteDatabaseG0.inTransaction()) {
                                                sQLiteDatabaseG0.endTransaction();
                                            }
                                            w3h.h(w0hVar);
                                            w0hVar.g.b(e, "Error writing entry to local database");
                                            this.e = z2;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseG0 != null) {
                                                sQLiteDatabaseG0.close();
                                            }
                                            i3++;
                                            z3 = z;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused2) {
                                        SystemClock.sleep(i2);
                                        i2 += 20;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseG0 != null) {
                                            sQLiteDatabaseG0.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    }
                                } else {
                                    z = z3 ? 1 : 0;
                                    z2 = true;
                                }
                            } else {
                                z = z3 ? 1 : 0;
                                z2 = true;
                            }
                            sQLiteDatabaseG0.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabaseG0.setTransactionSuccessful();
                            sQLiteDatabaseG0.endTransaction();
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            sQLiteDatabaseG0.close();
                            return z2;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z = z3 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteFullException e7) {
                            e = e7;
                            z = z3 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteException e8) {
                            e = e8;
                            z = z3 ? 1 : 0;
                            z2 = true;
                            cursorRawQuery = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z = z3 ? 1 : 0;
                    sQLiteDatabaseG0 = null;
                    cursorRawQuery = null;
                } catch (SQLiteFullException e9) {
                    e = e9;
                    z = z3 ? 1 : 0;
                    sQLiteDatabaseG0 = null;
                    cursorRawQuery = null;
                } catch (SQLiteException e10) {
                    e = e10;
                    z = z3 ? 1 : 0;
                    z2 = true;
                    sQLiteDatabaseG0 = null;
                    cursorRawQuery = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabaseG0 = null;
                }
            }
            boolean z4 = z3 ? 1 : 0;
            w3h.h(w0hVar);
            w0hVar.Z.a("Failed to write entry to local database");
            return z4;
        }
        return z3;
    }
}
