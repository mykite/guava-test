package com.kite.util;

import java.io.File;
import java.io.IOException;

import org.eclipse.jgit.api.CommitCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.AbortedByHookException;
import org.eclipse.jgit.api.errors.ConcurrentRefUpdateException;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.NoHeadException;
import org.eclipse.jgit.api.errors.NoMessageException;
import org.eclipse.jgit.api.errors.UnmergedPathsException;
import org.eclipse.jgit.api.errors.WrongRepositoryStateException;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;

/**
 * 
 * 类GitUtil.java的实现描述：git工具类
 * 
 * @author pengliang 2016年10月18日 上午10:00:08
 */
public class GitUtil {

	private GitUtil gitUtil = new GitUtil();

	private String gitPath;
	private String username;
	private String password;

	public void commitFile(String file) throws IOException {

	}

	public GitUtil getInstanse() {
		return gitUtil;
	}

	public GitUtil getGitUtil() {
		return gitUtil;
	}

	public void setGitUtil(GitUtil gitUtil) {
		this.gitUtil = gitUtil;
	}

	public String getGitPath() {
		return gitPath;
	}

	public void setGitPath(String gitPath) {
		this.gitPath = gitPath;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static void main(String[] args) throws IOException, NoHeadException, NoMessageException, UnmergedPathsException,
			ConcurrentRefUpdateException, WrongRepositoryStateException, AbortedByHookException, GitAPIException {
		// 打开一个存在的仓库
		Repository existingRepo = new FileRepositoryBuilder().setGitDir(new File("E:/workspace/zhongansouxian/guava-test/.git")).build();
		Git git = new Git(existingRepo);
		// Stage all files in the repo including new files
		git.add().addFilepattern(".").call();

		// and then commit the changes.
		git.commit().setMessage("Commit all changes including additions").call();
		git.commit().setAll(true).setMessage("Commit changes to all files").call();

		System.out.println("Committed all changes to repository at " + existingRepo.getDirectory());
	}
}
