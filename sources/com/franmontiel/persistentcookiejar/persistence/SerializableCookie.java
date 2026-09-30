package com.franmontiel.persistentcookiejar.persistence;

import defpackage.du2;
import defpackage.eu2;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class SerializableCookie implements Serializable {
    private static final long serialVersionUID = -8594045714036645534L;
    public transient eu2 a;

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        du2 du2Var = new du2();
        du2Var.d((String) objectInputStream.readObject());
        du2Var.f((String) objectInputStream.readObject());
        long j = objectInputStream.readLong();
        if (j != -1) {
            du2Var.c(j);
        }
        String str = (String) objectInputStream.readObject();
        str.getClass();
        du2Var.b(str, false);
        du2Var.e((String) objectInputStream.readObject());
        if (objectInputStream.readBoolean()) {
            du2Var.f = true;
        }
        if (objectInputStream.readBoolean()) {
            du2Var.g = true;
        }
        if (objectInputStream.readBoolean()) {
            du2Var.b(str, true);
        }
        this.a = du2Var.a();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.a.a);
        objectOutputStream.writeObject(this.a.b);
        eu2 eu2Var = this.a;
        objectOutputStream.writeLong(eu2Var.h ? eu2Var.c : -1L);
        objectOutputStream.writeObject(this.a.d);
        objectOutputStream.writeObject(this.a.e);
        objectOutputStream.writeBoolean(this.a.f);
        objectOutputStream.writeBoolean(this.a.g);
        objectOutputStream.writeBoolean(this.a.i);
    }
}
