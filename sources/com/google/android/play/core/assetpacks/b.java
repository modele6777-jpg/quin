package com.google.android.play.core.assetpacks;

import android.content.Context;
import defpackage.rch;
import defpackage.wgg;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static final rch c = new rch("AssetPackStorage");
    public final Context a;
    public final wgg b;

    public b(Context context, wgg wggVar) {
        this.a = context;
        this.b = wggVar;
    }

    public static long b(File file) {
        if (!file.exists()) {
            return -1L;
        }
        ArrayList arrayList = new ArrayList();
        int length = file.listFiles().length;
        rch rchVar = c;
        if (length > 1) {
            rchVar.f("Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e) {
            rchVar.d(e, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1L;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    public static boolean f(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zF = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                zF &= f(file2);
            }
        }
        if (file.delete()) {
            return zF;
        }
        return false;
    }

    public final void a(int i, long j, String str) {
        File file = new File(d(), str);
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals(String.valueOf(i)) && !file2.getName().equals("stale.tmp")) {
                    f(file2);
                } else if (file2.getName().equals(String.valueOf(i))) {
                    for (File file3 : file2.listFiles()) {
                        if (!file3.getName().equals(String.valueOf(j))) {
                            f(file3);
                        }
                    }
                }
            }
        }
    }

    public final File c(int i, long j, String str) {
        return new File(new File(new File(new File(d(), "_tmp"), str), String.valueOf(i)), String.valueOf(j));
    }

    public final File d() {
        return new File(this.a.getFilesDir(), "assetpacks");
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        try {
            if (d().exists() && d().listFiles() != null) {
                for (File file : d().listFiles()) {
                    if (!file.getCanonicalPath().equals(new File(d(), "_tmp").getCanonicalPath())) {
                        arrayList.add(file);
                    }
                }
            }
            return arrayList;
        } catch (IOException e) {
            c.b("Could not process directory while scanning installed packs. %s", e);
            return arrayList;
        }
    }

    public final int g(int i, long j, String str) throws IOException {
        File file = new File(new File(c(i, j, str), "_packs"), "merge.tmp");
        if (!file.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") == null) {
                throw new g("Merge checkpoint file corrupt.");
            }
            try {
                return Integer.parseInt(properties.getProperty("numberOfMerges"));
            } catch (NumberFormatException e) {
                throw new g(e, "Merge checkpoint file corrupt.");
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final File h(int i, long j, String str) {
        return new File(new File(new File(d(), str), String.valueOf(i)), String.valueOf(j));
    }

    public final File i(int i, long j, String str, String str2) {
        return new File(new File(new File(c(i, j, str), "_slices"), "_unverified"), str2);
    }

    public final File j(int i, long j, String str, String str2) {
        return new File(new File(new File(c(i, j, str), "_slices"), "_verified"), str2);
    }

    public final String k(String str) {
        int length;
        File file = new File(d(), str);
        boolean zExists = file.exists();
        rch rchVar = c;
        if (!zExists) {
            rchVar.a("Pack not found with pack name: %s", str);
            return null;
        }
        wgg wggVar = this.b;
        File file2 = new File(file, String.valueOf(wggVar.a()));
        if (!file2.exists()) {
            rchVar.a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(wggVar.a()));
            return null;
        }
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles == null || (length = fileArrListFiles.length) == 0) {
            rchVar.a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(wggVar.a()));
            return null;
        }
        if (length <= 1) {
            return fileArrListFiles[0].getCanonicalPath();
        }
        rchVar.b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(wggVar.a()));
        return null;
    }

    public final HashMap l() {
        HashMap map = new HashMap();
        Iterator it = e().iterator();
        while (it.hasNext()) {
            String name = ((File) it.next()).getName();
            int iB = (int) b(new File(d(), name));
            long jB = b(new File(new File(d(), name), String.valueOf(iB)));
            if (h(iB, jB, name).exists()) {
                map.put(name, Long.valueOf(jB));
            }
        }
        return map;
    }
}
