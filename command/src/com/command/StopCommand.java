package com.command;

/**
 * 具体命令角色类
 *
 */
public class StopCommand implements Command {
	
	private AudioPlayer myAudio;

	public StopCommand(AudioPlayer audioPlayer) {
		myAudio = audioPlayer;
	}

	/**
	 * 执行方法
	 */
	@Override
	public void execute() {
		myAudio.stop();
	}

}
