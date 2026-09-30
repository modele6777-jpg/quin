package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vb3 implements d3b {
    public final Context a;
    public final List b = t72.H(new ParamSpec("path", ParamType.STRING, false, (nh7) null, 8, (rp3) null));

    public vb3(Context context) {
        this.a = context;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) throws Exception {
        File[] fileArrListFiles;
        File file;
        Long lValueOf;
        nh7 nh7Var = (nh7) ti7Var.get("path");
        iy9 iy9Var = null;
        String strC = nh7Var != null ? oh7.i(nh7Var).c() : null;
        if (strC == null || v4e.Q(strC)) {
            File externalFilesDir = this.a.getExternalFilesDir("qa-dump");
            if (externalFilesDir != null && (fileArrListFiles = externalFilesDir.listFiles(new tb3(0))) != null && fileArrListFiles.length != 0) {
                file = fileArrListFiles[0];
                int length = fileArrListFiles.length - 1;
                if (length != 0) {
                    long jLastModified = file.lastModified();
                    if (1 <= length) {
                        int i = 1;
                        while (true) {
                            File file2 = fileArrListFiles[i];
                            long jLastModified2 = file2.lastModified();
                            if (jLastModified < jLastModified2) {
                                file = file2;
                                jLastModified = jLastModified2;
                            }
                            if (i == length) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else {
                file = null;
            }
        } else {
            file = new File(strC);
        }
        if (file == null) {
            return new QaResult.Err("no snapshot dir found", "no_snapshot");
        }
        if (!file.isDirectory()) {
            return new QaResult.Err(ub3.i("snapshot dir does not exist: ", file.getAbsolutePath()), "no_snapshot");
        }
        File file3 = new File(file, "databases/divination");
        if (file3.isFile()) {
            try {
                SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(file3.getPath(), null, 1);
                try {
                    lValueOf = Long.valueOf(sQLiteDatabaseOpenDatabase.getVersion());
                    sQLiteDatabaseOpenDatabase.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ym8.t(sQLiteDatabaseOpenDatabase, th);
                        throw th2;
                    }
                }
            } catch (Exception unused) {
                lValueOf = null;
            }
            if (lValueOf == null) {
                return new QaResult.Err("cannot read user_version from snapshot db", "bad_snapshot_db");
            }
            long jLongValue = lValueOf.longValue();
            Cursor cursorL0 = a6c.i(this.a).g().j0().l0("PRAGMA user_version");
            try {
                long j = cursorL0.moveToFirst() ? cursorL0.getLong(0) : -1L;
                cursorL0.close();
                if (jLongValue != j) {
                    return new QaResult.Err(tec.h(j, "; refusing restore", ub3.p("schema mismatch: snapshot=", " app=", jLongValue)), "schema_mismatch");
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    ym8.t(cursorL0, th3);
                    throw th4;
                }
            }
        }
        s52 s52Var = a6c.i(this.a).g;
        synchronized (s52Var) {
            if (s52Var.c.compareAndSet(false, true)) {
                while (s52Var.b.get() != 0) {
                }
                s52Var.a.invoke();
            }
        }
        try {
            File dataDir = this.a.getDataDir();
            dataDir.getClass();
            ArrayList arrayListH = z5c.H(file, dataDir);
            File file4 = new File(this.a.getDataDir(), "databases/divination");
            if (file4.isFile()) {
                try {
                    SQLiteDatabase sQLiteDatabaseOpenDatabase2 = SQLiteDatabase.openDatabase(file4.getPath(), null, 1);
                    try {
                        Cursor cursorRawQuery = sQLiteDatabaseOpenDatabase2.rawQuery("SELECT COUNT(*) FROM divination", null);
                        try {
                            long j2 = cursorRawQuery.moveToFirst() ? cursorRawQuery.getLong(0) : 0L;
                            cursorRawQuery.close();
                            Cursor cursorRawQuery2 = sQLiteDatabaseOpenDatabase2.rawQuery("SELECT COUNT(*) FROM quick_decision", null);
                            try {
                                long j3 = cursorRawQuery2.moveToFirst() ? cursorRawQuery2.getLong(0) : 0L;
                                cursorRawQuery2.close();
                                iy9 iy9Var2 = new iy9(Long.valueOf(j2), Long.valueOf(j3));
                                sQLiteDatabaseOpenDatabase2.close();
                                iy9Var = iy9Var2;
                            } catch (Throwable th5) {
                                try {
                                    throw th5;
                                } catch (Throwable th6) {
                                    ym8.t(cursorRawQuery2, th5);
                                    throw th6;
                                }
                            }
                        } catch (Throwable th7) {
                            try {
                                throw th7;
                            } catch (Throwable th8) {
                                ym8.t(cursorRawQuery, th7);
                                throw th8;
                            }
                        }
                    } catch (Throwable th9) {
                        try {
                            throw th9;
                        } catch (Throwable th10) {
                            ym8.t(sQLiteDatabaseOpenDatabase2, th9);
                            throw th10;
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            fl8 fl8Var = new fl8();
            fl8Var.put("snapshot_dir", oh7.c(file.getAbsolutePath()));
            ArrayList arrayList = new ArrayList(t72.u(arrayListH, 10));
            Iterator it = arrayListH.iterator();
            while (it.hasNext()) {
                arrayList.add(oh7.c((String) it.next()));
            }
            fl8Var.put("restored", new yg7(arrayList));
            if (iy9Var != null) {
                long jLongValue2 = ((Number) iy9Var.a()).longValue();
                long jLongValue3 = ((Number) iy9Var.b()).longValue();
                fl8Var.put("divination_count", oh7.b(Long.valueOf(jLongValue2)));
            }
            fl8Var.put("requiresRestart", oh7.a(Boolean.TRUE));
            return new QaResult.Ok(new ti7(fl8Var.j()));
        } catch (Exception e) {
            return new QaResult.Err(ub3.i("restore IO failed: ", e.getMessage()), "io_error");
        }
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "data.restore";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.b;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "从快照覆盖恢复本地 DB + DataStore + prefs（需重启生效）";
    }
}
