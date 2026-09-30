package com.google.android.play.core.assetpacks;

import defpackage.ib8;
import defpackage.rch;
import defpackage.rgg;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class m {
    public static final rch b = new rch("MergeSliceTaskHandler");
    public final b a;

    public m(b bVar) {
        this.a = bVar;
    }

    public static void b(File file, File file2) {
        if (!file.isDirectory()) {
            if (file2.exists()) {
                throw new g("File clashing with existing file from other slice: ".concat(file2.toString()));
            }
            if (!file.renameTo(file2)) {
                throw new g("Unable to move file: ".concat(String.valueOf(file)));
            }
            return;
        }
        file2.mkdirs();
        for (File file3 : file.listFiles()) {
            b(file3, new File(file2, file3.getName()));
        }
        if (!file.delete()) {
            throw new g("Unable to delete directory: ".concat(String.valueOf(file)));
        }
    }

    public final void a(rgg rggVar) {
        String str = (String) rggVar.b;
        int i = rggVar.a;
        long j = rggVar.d;
        int i2 = rggVar.c;
        String str2 = rggVar.e;
        b bVar = this.a;
        File fileJ = bVar.j(i2, j, str, str2);
        if (!fileJ.exists()) {
            throw new g(ib8.j("Cannot find verified files for slice ", rggVar.e, "."), i);
        }
        bVar.getClass();
        File file = new File(bVar.c(i2, j, str), "_packs");
        if (!file.exists()) {
            file.mkdirs();
        }
        b(fileJ, file);
        try {
            int iG = bVar.g(i2, j, str) + 1;
            File file2 = new File(new File(bVar.c(i2, j, str), "_packs"), "merge.tmp");
            Properties properties = new Properties();
            properties.put("numberOfMerges", String.valueOf(iG));
            file2.getParentFile().mkdirs();
            file2.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (IOException e) {
            b.b("Writing merge checkpoint failed with %s.", e.getMessage());
            throw new g("Writing merge checkpoint failed.", e, i);
        }
    }
}
